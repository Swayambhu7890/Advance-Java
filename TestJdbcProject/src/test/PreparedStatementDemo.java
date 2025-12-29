package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		try
		{
		    //Step 1:- Register a Driver	
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		    //Step 2:- Create a Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","root");
			
			//Step 3:- Create a SQL Statement(Insert,Update,Delete,Where)
			PreparedStatement pst = con.prepareStatement("Insert into person values(?,?,?)");
		    pst.setInt(1,104);
			pst.setString(2, "Swayambhu");
			pst.setInt(3, 25);
			
			//Step 4:-Execute Query
			int i = pst.executeUpdate();
			System.out.println(i+" Record Inserted");
			
			//Step 5:- Close Connection
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
