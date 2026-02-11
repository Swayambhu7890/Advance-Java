package test;

//Implements interface PaymentStrategy
public class CreditCardPayment implements PaymentStrategy 
{

	@Override
	public void pay(int amount) 
	{
          System.out.println("Paid "+ amount);		
	}
   
}
