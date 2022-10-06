package strategy_compute_price.after;

class WeekdayComputePrice implements IComputePriceStrategy {

	@Override
	public double computeItemPrice(double price, int quantity) {
		return price * quantity * (1.0 - WEEKDAY_DISCOUNT_RATE);
	}

}
