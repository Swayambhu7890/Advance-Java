package com.bhapkar.swayambhu.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentService 
{
	//Join point method
   public void processPayment()
   {
	   System.out.println("Payment is processing....");
   }
}
