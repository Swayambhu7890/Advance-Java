package com.config.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) 
	{
          ApplicationContext context = new ClassPathXmlApplicationContext("com/config/interfaces/spring.xml");
          //OrderImplementation o1 = (OrderImplementation)context.getBean("oi");
          //o1.placeOrder();
          
          //By using Annotation
          OrderImplementation o2 = (OrderImplementation)context.getBean("orderimplementation");
          o2.placeOrder();
	}
          
	
}
