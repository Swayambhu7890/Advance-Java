package test;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ImageStoreDemo 
{
    //How to write(store) Image in a Database
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
			PreparedStatement pst = con.prepareStatement("Insert into imgtable(name, profile_pic) values(?,?)");
		    pst.setString(1,"Nature");
		    
		    FileInputStream input = new FileInputStream(new File("C:\\java  Sep 2025\\Nature.jpg"));
		    pst.setBinaryStream(2, input);
		    
		    //Step 4:- Execute Query
		    int rs = pst.executeUpdate();
		    
		    //Display Result
		    if(rs > 0)
		    {
		    	System.out.println("Data Inserted Successfully");
		    }
		    
		    //Step 5:-Close connection
		    input.close();
		    pst.close();
		    con.close();
		    		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
