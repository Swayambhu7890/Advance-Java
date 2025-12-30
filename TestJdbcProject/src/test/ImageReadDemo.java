package test;

import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ImageReadDemo
{
    //How to read Image from a Database
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
			//To read the image
			PreparedStatement pst = con.prepareStatement("select * from imgtable");
			
			//Step 4:- Execute a Query
			//To store the image in Resultset
			ResultSet rs = pst.executeQuery();
			
		    
		    //To read data(image) from ResultSet
		    if(rs.next())
		    {
		    	Blob b = rs.getBlob(2);                                                      //To read the image
		    	byte barr[] = b.getBytes(1, (int)b.length());                                //To convert image into bytearray
		    	
			    FileOutputStream out = new FileOutputStream("C:\\java  Sep 2025\\Nature.jpg");     //To write the image
			    
			    out.write(barr);
			    
			    out.close();                                                      

		    }
		    
		    //Step 5:- Close a Connection
		    con.close();
		    System.out.println("Image Read SuccessFull");
		    		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
