package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class ResultSetMetaDataDemo 
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
			PreparedStatement pst = con.prepareStatement("select * from person");
		   
			
			//Step 4:-Execute Query
			 ResultSet rs = pst.executeQuery();
			 
			 ResultSetMetaData rsmd = rs.getMetaData();
			 
			 System.out.println("Total no of columns: "+rsmd.getColumnCount());
			 System.out.println("Name of First column: "+rsmd.getColumnName(1));
			 System.out.println("Type of First column: "+rsmd.getColumnTypeName(1)); 


			//Step 5:- Close Connection
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
