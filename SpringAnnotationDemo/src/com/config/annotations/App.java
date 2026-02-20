package com.config.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/config/annotations/spring.xml");
		Instructor instructor = (Instructor)context.getBean("inst");
		System.out.println(instructor.hashCode());
		
		//To check the type of object(scope)
		Instructor instructor2 = (Instructor)context.getBean("inst");
		System.out.println(instructor2.hashCode());
		
		//Above two objects are working in same scope as their hashCode values are same
		
		//How to use Annotations for List 
		Instructor instructorlist = (Instructor)context.getBean("inst");
		System.out.println(instructorlist);
		
		//To use the String Predefined Methods
		String name = "Rahul";
		System.out.println(name.charAt(0));
	}

}
