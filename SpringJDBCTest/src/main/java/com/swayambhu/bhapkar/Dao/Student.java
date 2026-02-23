package com.swayambhu.bhapkar.Dao;

public class Student 
{
     private int id;
     private String name;
     private String email;
     
     //Default Constructor for id
     public Student()
     {
    	 
     }

     //Parameterized Constructor for name, email
	  public Student(String name, String email) 
	  {
		super();
		this.name = name;
		this.email = email;
	  }

	//getters and setters method
	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}
	  
	  
	  
     
     
     
     
     
}
