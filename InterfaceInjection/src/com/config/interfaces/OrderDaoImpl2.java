package com.config.interfaces;

import org.springframework.stereotype.Component;

@Component("dao2")
public class OrderDaoImpl2 implements OrderDaoInterface {

	@Override
	public void createOrder() 
	{
         System.out.println("Inside OrderDaoImpl 2 Class");		
	}

}
