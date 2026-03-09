package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//To convert this class into Table
@Entity
public class Student 
{
	@Id                                                                       //Identifies the primary key of the entity (unique identifier for each record).
	@GeneratedValue(strategy = GenerationType.IDENTITY)                       //Automatically generates the id value
    private int id;
    private String name;
    private String email;
    
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
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	//ToString Method
	@Override
	public String toString() 
	{
		return "Student [id=" + id + ", name=" + name + ", email=" + email + "]";
	}  
    
}
