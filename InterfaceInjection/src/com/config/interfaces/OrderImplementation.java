package com.config.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("orderimplementation")
public class OrderImplementation implements OrderInterface {

	@Autowired                                                      //To inject the  dependency
	@Qualifier                                                      //To Qualify the particular Object
	private OrderDaoInterface dao;                                  //Reference created
	
	
	public OrderDaoInterface getDao() 
	{
		return dao;
	}

	public void setDao(OrderDaoInterface dao) 
	{
		this.dao = dao;
	}



	@Override
	public void placeOrder() 
	{
		  System.out.println("Inside OrderImplementation Class");
		  dao.createOrder();
	}

}
