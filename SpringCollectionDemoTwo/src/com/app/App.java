//How we can able to inject the collection dependencies
package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Question;

public class App {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//To access the Bean Class
		Question q = (Question) context.getBean("q1");
		
		q.display();
		
		

	}

}
