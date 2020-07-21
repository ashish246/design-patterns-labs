package com.dp.behavioral.strategy;

/**
 * For our example, we will try to implement a simple Shopping Cart where we
 * have two payment strategies – using Credit Card or using PayPal.
 * 
 * First of all we will create the interface for our strategy, in our case to
 * pay the amount passed as argument.
 * 
 * @author Administrator
 *
 */
public class TestStrategyPattern {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

		Item item1 = new Item("1234", 10);
		Item item2 = new Item("5678", 40);

		cart.addItem(item1);
		cart.addItem(item2);

		// pay by paypal
		cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));

		// pay by credit card
		cart.pay(new CreditCardStrategy("Ashish Tripathi", "1234567890123456",
				"786", "12/15"));
	}

}