package com.config.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst")                          //It Help us to define the name of bean instead of using the default class name as in lowercase(instructor)
@Scope("prototype")                         //To change the scope(hashCode) of object(Scope Annotation :- To define scope of object)
public class Instructor 
{
	@Value("101")
    private int id;
	
	@Value("Swayambhu")
    private String name;
    
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
	
	@Override
	public String toString() 
	{
		return "Instructor [id=" + id + ", name=" + name + "]";
	}
	
	   
}
