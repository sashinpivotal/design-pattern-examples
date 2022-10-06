package strategy_compute_price.before;

public class Client {
	public static void main(String[] args) {
		ShoppingCart shoppingCart = new ShoppingCart();
		System.out.println(shoppingCart.computeItemPrice(10.0, 1, DiscountType.WEEKDAY_HOUR));
		System.out.println(shoppingCart.computeItemPrice(8.0, 3, DiscountType.WEEKEND_HOUR));
	}

}
