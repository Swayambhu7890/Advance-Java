package test;

import java.sql.*;

public class JdbcDemo 
{

	public static void main(String[] args) 
	{
		
		try
		{
			//Step 1:- Register a Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step 2:- Create a Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","root");
			
			//Step 3:- Create a SQL Statement
			Statement stmt = con.createStatement();
			
			//Step 4:- Execute a SQL Statement(Query) 
			ResultSet rs = stmt.executeQuery("select * from person");
			while(rs.next())
			{
		       System.out.println("Id: "+rs.getInt(1)+" "+"Name: "+rs.getString(2)+" "+"Age: "+rs.getInt(3));
			}
		    
		    //Step 5:- Close Connection
		    con.close();
		}
		catch(Exception e)
		{
		   System.out.println(e);	
		}

	}

}
