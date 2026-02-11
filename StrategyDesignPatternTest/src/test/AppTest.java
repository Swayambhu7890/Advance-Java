package test;

public class AppTest 
{
	public static void main(String[] args)
	{
	 //Constructor Injection
     ShoppingCart cart = new ShoppingCart(new CreditCardPayment());  //new CreditCardPayment() :- Injecting dependent object
     
     //Setter Method Injection
     //Pay using Credit Card
     cart.setPaymentStrategy(new CreditCardPayment());           //(Calling PaymentStrategy)
     cart.checkout(100);
     
	}
}
