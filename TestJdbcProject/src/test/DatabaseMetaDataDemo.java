package test;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class DatabaseMetaDataDemo 
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
			DatabaseMetaData  dbmd = con.getMetaData();
		   
			 
			 System.out.println("Driver Name: "+dbmd.getDriverName());
			 System.out.println("Driver Version: "+dbmd.getDriverVersion());
			 System.out.println("Database Version: "+dbmd.getDatabaseProductVersion()); 
			 System.out.println("Database Name: "+dbmd.getDatabaseProductName()); 

			 
			//Step 5:- Close Connection
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}


	}

}
