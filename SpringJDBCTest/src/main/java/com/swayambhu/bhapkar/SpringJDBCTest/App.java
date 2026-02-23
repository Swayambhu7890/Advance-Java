package com.swayambhu.bhapkar.SpringJDBCTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 */
public class App 
{
    public static void main(String[] args) 
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/swayambhu/bhapkar/SpringJDBCTest/spring.xml");
    	JdbcTemplate jdbcTemplate = (JdbcTemplate)context.getBean("jdbcTemplate");
    	String sql = "insert into employee values (?,?,?)";
    	int result = jdbcTemplate.update(sql, 1, "Swayambhu", "Bhapkar");
    	System.out.println("Number of records inserted are: "+ result);
    }
}
