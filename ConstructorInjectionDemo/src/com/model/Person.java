package com.model;

public class Person 
{
	//Overloading the Constructor
	public Person(double n2 , double i2) 
	{
		System.out.println("Double Constructor Executed");
	}
		
	public Person(String name, int id) 
	{
		System.out.println("Constructor Executed");
	}
    
	public Person(String n1 , String i1) 
	{
		System.out.println("String Constructor Executed");
	}    
    
}
