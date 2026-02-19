package com.swayambhu.bhapkar.externalization.SpringExternalization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) 
    {
        System.out.println("Hello World!");
        
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        MyDao dao = (MyDao)context.getBean("mydao");
        System.out.println(dao);
    }
}
