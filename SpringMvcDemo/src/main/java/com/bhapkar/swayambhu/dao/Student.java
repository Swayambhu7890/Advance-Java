//Bean Class
package com.bhapkar.swayambhu.dao;

public class Student 
{
    private int id;
    private String name;
    private int age;
    
    //Default Constructor
    public Student()
    {
    	
    }
    
    //Parameterized Constructor
    public Student(int id, String name, int age) 
    {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
    
	//getters and setters
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
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	
	//ToString Method
	@Override
	public String toString() 
	{
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
    	
    
}
