package strategy_payment.before;

public class Client {

	public static void main(String[] args) {
		ShoppingCart shoppingCart = new ShoppingCart();

		Item item1 = new Item("1234", 10);
		Item item2 = new Item("5678", 40);

		shoppingCart.addItem(item1);
		shoppingCart.addItem(item2);

		// pay by paypal
		shoppingCart.pay("paypal");

		// pay by credit card
		shoppingCart.pay("creditcard");
	}

}