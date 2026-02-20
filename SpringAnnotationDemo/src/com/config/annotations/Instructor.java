package com.config.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst")                          //It Help us to define the name of bean instead of using the default class name as in lowercase(instructor)
@Scope("prototype")                         //To change the scope(hashCode) of object(Scope Annotation :- To define scope of object)
public class Instructor 
{
	//@Value("101")
	//@Value("#{4 + 2}")                                 //Expression language with primitive types for mathematical operation
	//@Value("#{4>6?25:20}")                             //Expression language with primitive types for relational  operation
	//@Value("#{T(java.lang.Math).abs(-99)}")            //Expression language using Static method for Absolute method
	//@Value("#{new Integer(88)}")                       //Expression language using Static method for Object type
	//@Value("#{T(java.lang.Integer).MIN_VALUE}")        //Expression language using Static method for Constant value
	@Value("#{T(java.lang.Integer).MAX_VALUE}")          //Expression language using Static method for Constant value
    private int id = 101;
	
	//@Value("Swayambhu")
	//@Value("#{'Swayambhu Bhapkar'}")                              //Expression language with String types
	//@Value("#{new java.lang.String('Swayambhu Bhapkar')}")        //Expression language with String type to define it as a object   
	//@Value("#{'Swayambhu Bhapkar'.toUpperCase()}")                //Expression language with String methods in UpperCase 
	@Value("#{'Swayambhu Bhapkar'.toLowerCase()}")                  //Expression language with String methods in LowerCase
    private String name = "Ram";
	
	@Value("#{topics}")                                             //Expression Language
	private List<String> topics;                                    //To inject the list using annotation
	
	@Autowired                                                      //To Inject Referenced type of dependency(data)  
	private Profile profile;
	
	//@Value("#{2+4<5}")
	@Value("#{2+4<5?false:true}")
	private boolean active;                                         //Expression Language using Boolean DataType                    
    
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
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", profile=" + profile + ", active=" + active + "]";
	}
	
	
	
	
	
	
	
	   
}
