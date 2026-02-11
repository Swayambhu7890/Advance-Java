//payment processor class
package test;

public class ShoppingCart 
{
    private PaymentStrategy paymentStrategy = null;                //Created Reference of Interface that is choosing the composition over Inheritance 

    //Setters method for PaymentStrategy(setter Injection)
	public void setPaymentStrategy(PaymentStrategy paymentStrategy) 
	{
		this.paymentStrategy = paymentStrategy;
	}
	
	//Constructor Injection
	public ShoppingCart(PaymentStrategy paymentStrategy)
	{
		this.paymentStrategy = paymentStrategy;
	}
	
	public void checkout(int amount)
	{
		paymentStrategy.pay(amount);
	}
}
