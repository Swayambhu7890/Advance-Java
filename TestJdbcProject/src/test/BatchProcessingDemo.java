package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchProcessingDemo 
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
			con.setAutoCommit(false);
			
			//Step 3:- Create a SQL Statement
			Statement stmt = con.createStatement();
			
			//Step 4:- Prepare a Batch
			stmt.addBatch("insert into person (id,name,age) values(106,'Rick',56)");
			stmt.addBatch("insert into person (id,name,age) values(107,'Sher',78)");
			

			//Step 5:- Execute a SQL Statement(Query) 
			stmt.executeBatch();
		    
		    //Step 6:- Close Connection
			con.commit();
			
			System.out.println("Success");
		    con.close();
		}
		catch(Exception e)
		{
		   System.out.println(e);	
		}


	}

}
