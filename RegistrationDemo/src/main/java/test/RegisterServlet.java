package test;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.*;

public class RegisterServlet extends HttpServlet 
{

    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String city = request.getParameter("city");

        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registrationdb", "root","root");

            //STEP 1: Check if user already exists
            PreparedStatement checkPs = con.prepareStatement("SELECT email FROM users WHERE email=?");
            checkPs.setString(1, email);

            ResultSet rs = checkPs.executeQuery();

            if (rs.next()) 
            {
                //Email already registered
                response.sendRedirect("register.html?msg=already");
                return;
            }

            //STEP 2: Insert new user 
            PreparedStatement insertPs = con.prepareStatement("INSERT INTO users(name,email,password,city) VALUES (?,?,?,?)");

            insertPs.setString(1, name);
            insertPs.setString(2, email);
            insertPs.setString(3, password);
            insertPs.setString(4, city);

            int status = insertPs.executeUpdate();

            if (status > 0) 
            {
                response.sendRedirect("login.html?msg=success");
            } 
            else 
            {
                response.sendRedirect("register.html?msg=failed");
            }

            con.close();

        } 
        catch (Exception e) 
        {
            System.out.println(e);
            response.sendRedirect("register.html?msg=failed");
        }
    }
}
