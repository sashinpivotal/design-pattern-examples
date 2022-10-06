package strategy_compute_price.after;

public class Client {
	public static void main(String[] args) {
		
		// Select weekday pricing strategy during runtime
		ShoppingCart shoppingCart = new ShoppingCart(new WeekdayComputePrice());
		System.out.println("weekday price = "
				+ shoppingCart.computeItemPrice(10.0, 2));
		
		// Select weekend pricing strategy during runtime
		shoppingCart = new ShoppingCart(new WeekendComputePrice());
		System.out.println("weekend price = "
				+ shoppingCart.computeItemPrice(10.0, 2));
	}

}