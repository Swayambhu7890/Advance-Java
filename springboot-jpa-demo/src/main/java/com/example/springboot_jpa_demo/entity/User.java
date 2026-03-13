package com.example.springboot_jpa_demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity                        //To convert this class into table
@Table(name = "users")         //Name the  table as users
public class User 
{
	@Id                                                             //To make id Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)             //To auto increment id
    private Integer id;
    private String name;
    private int age;
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
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
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
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + "]";
	}
	
	  
}
