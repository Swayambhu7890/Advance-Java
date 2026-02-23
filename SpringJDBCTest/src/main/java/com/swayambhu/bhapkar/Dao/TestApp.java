package com.swayambhu.bhapkar.Dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestApp {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/swayambhu/bhapkar/Dao/spring.xml");
    	StudentDao dao = (StudentDao)context.getBean("studentdao");
    	
    	//Call method of StudentDao Class
    	//Inserting Data
    	dao.save(new Student("Ram", "ram@example.com"));
    	
    	//Display Data
    	List<Student> students = dao.findAll();
    	for(Student s:students)
    	{
    		System.out.println(s.getId()+" "+s.getName()+" "+s.getEmail());
    	}
    	
    	//Delete Data
    	dao.delete(4);
    	
	}

}
