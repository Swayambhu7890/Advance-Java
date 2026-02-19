//Bean Class
package com.model;

public class MyDao 
{
    private String dbServer;

    // Parameterized Constructor
	public MyDao(String dbServer) 
	{
		super();
		this.dbServer = dbServer;
	}

	//To String Method
	@Override
	public String toString() {
		return "MyDao [dbServer=" + dbServer + "]";
	}
	   
}
