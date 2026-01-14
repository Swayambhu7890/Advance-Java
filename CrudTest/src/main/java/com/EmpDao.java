package com;
import java.util.*;
import java.sql.*;

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
    
    public static int save(Emp e)
    {
    	int status = 0;                                                                                 //Provides number after executing query
    	try
    	{
    		Connection con = EmpDao.getConnection();                                                    //This method will return the connection object
    		PreparedStatement ps = con.prepareStatement("insert into usertable(id, name, password, email, country) values (?,?,?,?,?)");       //To execute Query
    		ps.setInt(1, e.getId());
    		ps.setString(2, e.getName());
    		ps.setString(3, e.getPassword());
    		ps.setString(4, e.getEmail());
    		ps.setString(5, e.getCountry());
    		
    		status = ps.executeUpdate();                                                      //This method  is used to execute the statement and provide update
    		con.close();
    	}
    	catch(Exception e1)
    	{
    		System.out.println(e1);
    	}
    	return status;
    }
    
      public static List<Emp> getAllEmployees()                                              //To retrieve list of all the employees
      {
		List<Emp> list=new ArrayList<Emp>();                  //create list which will store all the details of all employees which are available in database table
		
		try {
			Connection con=EmpDao.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from usertable");                      //As we want all the data from table
			ResultSet rs=ps.executeQuery();                                                            //Provides result into ResultSet
			
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
