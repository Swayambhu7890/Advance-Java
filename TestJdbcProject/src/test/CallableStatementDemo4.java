package test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class CallableStatementDemo4 
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
			CallableStatement stmt = con.prepareCall("{call area_of_circle(?,?)}");
		    stmt.setInt(1,8);
		    stmt.registerOutParameter(2,Types.DOUBLE);
			
			
			//Step 4:-Execute Query
			stmt.execute();
			System.out.println("Area of a circle: "+stmt.getDouble(2));
			
			//Step 5:- Close Connection
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}


	}

}
