package com.model;

public class Employee 
{
   private int id;
   private String name;
   private Address address;
   
   public Employee()
   {
	   
	   
   }
   
   //Accept only primitive dependencies like id, name
    public Employee(int id, String name) 
    {
	    super();
	    this.id = id;
	    this.name = name;
     }

	public Employee(int id, String name, Address address) 
    {
	  super();
	  this.id = id;
	  this.name = name;
	  this.address = address;
    }
	
	public void show()
	{
		System.out.println(id+" "+name);
		System.out.println(address);
	}
   
   
}
