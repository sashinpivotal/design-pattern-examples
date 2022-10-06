package strategy_compute_price.after;

public interface IComputePriceStrategy {
	
	public static final double WEEKDAY_DISCOUNT_RATE = 0.1;
	public static final double WEEKEND_DISCOUNT_RATE = 0.2;
	
    public double computeItemPrice(double price, int quantity);
}
