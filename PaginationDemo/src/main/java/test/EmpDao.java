package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class EmpDao 
{
	//To establish the connection with the database(Dao:-Data access object)
    public static Connection getConnection()                                                              //Method to establish(create) the connection
    {
    	Connection con = null;                                                                        
    	try
    	{
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		
    	    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudtestdb","root","root");
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
		return con;
    }
    
    public static List<Emp> getRecords(int start, int pagelimit)                                              //To retrieve list of all the employees
    {
		List<Emp> list=new ArrayList<Emp>();                //create list which will store all the details of all employees which are available in database table
		
		try {
			Connection con=EmpDao.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from usertable limit "+(start - 1)+","+pagelimit);                   
			ResultSet rs=ps.executeQuery();                                                                            //Provides result into ResultSet
			
			while(rs.next())
			{
				//To retrieve data
				Emp e=new Emp();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setPassword(rs.getString(3));
				e.setEmail(rs.getString(4));
				e.setCountry(rs.getString(5));
				
				list.add(e);
			}
			con.close();
			
		}catch(Exception e1)
		{
			System.out.println(e1);
		}
		return list;
	  }
}
