package com.example.springboot_aop_demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect 
{
	@Before("execution(* com.example.springboot_aop_demo.service.*.*(..))")
     public void beforeMethod(JoinPoint joinPoint)
     {
    	System.out.println("Before Execution of method"); 
     }
     
	@After("execution(* com.example.springboot_aop_demo.service.*.*(..))")
     public void afterMethod(JoinPoint joinPoint)
     {
		System.out.println("After Execution of method");
     }
}
