package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.User;

public class App {

	public static void main(String[] args) 
	{
         ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
         User u = (User)context.getBean("u1");
         u.show();
         
         User u2 = (User)context.getBean("u2");
         u2.show();
         
         User u3 = (User)context.getBean("u3");
         u3.show();
	}

}
