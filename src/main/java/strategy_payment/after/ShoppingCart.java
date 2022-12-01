package strategy_payment.after;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Item> items;

	public ShoppingCart(){
		this.items=new ArrayList<Item>();
	}

	// GOOD: Code now uses strategy pattern.
	// This code does not need to be changed even if
	// we introduce a new strategy in the future,
	// for example, Apple pay.
	public void pay(IPaymentStrategy paymentMethod){
		int amount = calculateTotalPrice();
		paymentMethod.pay(amount);
	}

	public void addItem(Item item){
		this.items.add(item);
	}

	public int calculateTotalPrice(){
		int totalPrice = 0;
		for(Item item : items){
			totalPrice += item.getPrice();
		}
		return totalPrice;
	}

}