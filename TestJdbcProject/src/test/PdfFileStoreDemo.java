package test;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PdfFileStoreDemo 
{
    //To store PDFFile in Database
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
			PreparedStatement pst = con.prepareStatement("Insert into pdffile(pdfname, pdfdata) values(?,?)");
		    pst.setString(1,"Token");
		    
		    FileInputStream input = new FileInputStream(new File("C:\\java  Sep 2025\\Token.pdf"));
		    pst.setBinaryStream(2, input);
		    
		    //Step 4:- Execute Query
		    int rs = pst.executeUpdate();
		    
		    //Display Result
		    if(rs > 0)
		    {
		    	System.out.println("PDFFile Inserted Successfully");
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
