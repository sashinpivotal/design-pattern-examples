package strategy_compute_price.before;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
	
	private static final double WEEKDAY_DISCOUNT_RATE = 0.1;
	private static final double WEEKEND_DISCOUNT_RATE = 0.2;
	
	private List<Double> items = new ArrayList<Double>();

	public double computeItemPrice(double price, int quantity, DiscountType discountType) {
		double actualPrice = 0.0;
		
		// BAD: This code needs to be changed whenever we
		// need to introduce a new discount type, thus
		// introducing a new algorithm (computing actual price).
		// This violates "Open close" design principle.
		if (discountType == DiscountType.WEEKDAY_HOUR){
			actualPrice = price * quantity * (1.0 - WEEKDAY_DISCOUNT_RATE);
		}
		else if (discountType == DiscountType.WEEKEND_HOUR){
			actualPrice = price * quantity * (1.0 - WEEKEND_DISCOUNT_RATE);
		}
		
		items.add(actualPrice);
		return actualPrice;
	}

	public double computeTotalPrice() {
		double sum = 0;
		for (Double i : items) {
			sum += i;
		}
		return sum;
	}

}
