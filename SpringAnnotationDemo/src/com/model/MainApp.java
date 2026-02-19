package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) 
	{
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Student student = (Student)context.getBean(Student.class);
        student.display();
        
        Employee e1 = (Employee)context.getBean(Employee.class);
        e1.info();
	}

}
