package com.swayambhu.bhapkar.externalization.SpringExternalization;

public class MyDao 
{
    private String dbSource;

    //Parameterized Constructor
	public MyDao(String dbSource) 
	{
		super();
		this.dbSource = dbSource;
	}

	//To String Method
	@Override
	public String toString() 
	{
		return "MyDao [dbSource=" + dbSource + "]";
	}
	
	 
}
