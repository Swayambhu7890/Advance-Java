package com.bhapkar.swayambhu.SpringAopDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bhapkar.swayambhu.service.PaymentService;

/**
 * Hello world!
 */
public class App 
{
    public static void main(String[] args) 
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);  
        PaymentService service = context.getBean(PaymentService.class);     
        service.processPayment();
    }
}
