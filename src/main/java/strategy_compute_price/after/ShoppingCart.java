package strategy_compute_price.after;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
	
	private List<Double> items = new ArrayList<Double>();
	private IComputePriceStrategy computeItemPriceStrategy;

	public ShoppingCart(IComputePriceStrategy computeItemPriceStrategy) {
		this.computeItemPriceStrategy = computeItemPriceStrategy;
	}

	public double computeItemPrice(double price, int quantity) {
	
		// GOOD: Code now uses strategy pattern. 
		// This code does not need to be changed even if 
		// we introduce a new strategy, for example, 
		// computing price strategy for holiday.
		double itemPrice = computeItemPriceStrategy.computeItemPrice(price, quantity);
		
		items.add(itemPrice);
		return itemPrice;
	}

	public double computeTotalPrice() {
		double sum = 0;
		for (Double i : items) {
			sum += i;
		}
		return sum;
	}

}
