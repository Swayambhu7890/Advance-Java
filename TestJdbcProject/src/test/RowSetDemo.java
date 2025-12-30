package test;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			//Step 1:- Create CachedRowSet object
		   CachedRowSet rowset = RowSetProvider.newFactory().createCachedRowSet();
		   
		   //Step 2:- Set Database URL
		   rowset.setUrl("jdbc:mysql://localhost:3306/javadb");
		   
		   //Step 3:- Set Username	   
		   rowset.setUsername("root");
		   
		   //Step 4:- Set Password
		   rowset.setPassword("root");
		   
		   //Step 5:- Create SQL Query
		   rowset.setCommand("select * from person");
		   
		   //Step 6:- Execute the Query
		   rowset.execute();
		   
		   //Step 7:- Process the Data
		   while(rowset.next())
		   {
			   System.out.println("ID: "+rowset.getInt(1)+"Name: "+rowset.getString(2)+"Age: "+rowset.getInt(3));
		   }
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
