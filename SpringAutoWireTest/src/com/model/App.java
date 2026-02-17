package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) 
	{
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        A a = context.getBean("a",A.class);                                              //id(Name) and class of Autowiring
        a.display();
	}

}
