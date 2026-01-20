package test;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class LoginServlet extends HttpServlet 
{

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        try 
        {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create Connection
            Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/registrationdb","root","root" );

            // 3. Login validation
            PreparedStatement ps = con.prepareStatement("SELECT * FROM users WHERE email=? AND password=?");
            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) 
            {

                String name = rs.getString("name");

                pw.println("<html>");
                pw.println("<head>");
                pw.println("<style>");
                pw.println("body { font-family: Arial; background:#f4f6f8; }");
                pw.println(".container { width:80%; margin:40px auto; text-align:center; }");
                pw.println("table { margin:20px auto; width:100%; border-collapse:collapse; }");
                pw.println("th, td { padding:10px; border:1px solid #333; }");
                pw.println("th { background:#26a69a; color:white; }");
                pw.println("</style>");
                pw.println("</head>");

                pw.println("<body>");
                pw.println("<div class='container'>");

                pw.println("<h2>Welcome " + name + "</h2>");
                pw.println("<hr>");

                // 4. Fetch all users
                PreparedStatement ps2 = con.prepareStatement("SELECT * FROM users");
                ResultSet rs2 = ps2.executeQuery();

                pw.println("<h3>All Registered Users</h3>");
                pw.println("<table>");
                pw.println("<tr>");
                pw.println("<th>ID</th>");
                pw.println("<th>Name</th>");
                pw.println("<th>Email</th>");
                pw.println("<th>Password</th>");
                pw.println("<th>City</th>");
                pw.println("</tr>");

                while (rs2.next()) 
                {
                    pw.println("<tr>");
                    pw.println("<td>" + rs2.getInt("id") + "</td>");
                    pw.println("<td>" + rs2.getString("name") + "</td>");
                    pw.println("<td>" + rs2.getString("email") + "</td>");
                    pw.println("<td>" + rs2.getString("password") + "</td>");
                    pw.println("<td>" + rs2.getString("city") + "</td>");
                    pw.println("</tr>");
                }

                pw.println("</table>");
                pw.println("</div>");
                pw.println("</body></html>");

                rs2.close();
                ps2.close();

            } 
            else 
            {
                // Invalid login
                response.sendRedirect("login.html?msg=invalid");
            }

            rs.close();
            ps.close();
            con.close();

        } 
        catch (Exception e) 
        {
            System.out.println(e);
            response.sendRedirect("login.html?msg=error");
        }
    }
}
