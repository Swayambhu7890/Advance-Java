package com.bhapkar.swayambhu.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect 
{
	@Before("execution(* com.bhapkar.swayambhu.service.*.*(..))")
    public void logBefore()
    {
    	System.out.println("Logging Before Method Execution....");
    }
	
	@After("execution(* com.bhapkar.swayambhu.service.*.*(..))")
    public void logAfter()
    {
    	System.out.println("After Payment Process....");
    }
	
	@Around("execution(* com.bhapkar.swayambhu.service.*.*(..))")
    public void beforeAfter()
    {
    	System.out.println("Before and After....");
    }
}
