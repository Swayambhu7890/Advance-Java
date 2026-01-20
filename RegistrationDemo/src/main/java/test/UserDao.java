package test;

import java.sql.*;
import java.util.*;

public class UserDao 
{

    public static List<User> getAllUsers() 
    {
        List<User> list = new ArrayList<>();

        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registrationdb", "root", "root");

            PreparedStatement ps = con.prepareStatement("SELECT * FROM users");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) 
            {
                User u = new User();
                u.setId(rs.getInt("id"));
                u.setName(rs.getString("name"));
                u.setEmail(rs.getString("email"));
                u.setPassword(rs.getString("password"));
                u.setCity(rs.getString("city"));

                list.add(u);
            }

            con.close();

        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }

        return list;
    }
}
