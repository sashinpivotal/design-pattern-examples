package strategy_compute_price.after;

class WeekendComputePrice implements IComputePriceStrategy {

	@Override
	public double computeItemPrice(double price, int quantity) {
		return price * quantity * (1.0 - WEEKEND_DISCOUNT_RATE);
	}

}
