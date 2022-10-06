package strategy_payment.after;

public class Client {

	public static void main(String[] args) {
		
		// Set things up 
		ShoppingCart shoppingCart = new ShoppingCart();

		Item item1 = new Item("1234", 10);
		Item item2 = new Item("5678", 40);

		shoppingCart.addItem(item1);
		shoppingCart.addItem(item2);

		// GOOD: payment scheme can be determined during runtime
		shoppingCart.pay(decideWhichPaymentSchemeTouse());
		
	}

	private static IPaymentStrategy decideWhichPaymentSchemeTouse() {
		// Based on some business condition, return a proper payment scheme object
		// Here we are simulating that business condition via a boolean
		boolean test = true;
		return test? new PaypalStrategy("sangshin@jpassion.com", "mypassword"):
		             new CreditCardStrategy("Sang Shin", "1234567890123456", "786", "12/15");
	}

}