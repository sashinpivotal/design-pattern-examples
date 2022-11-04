package strategy_payment.after;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	List<Item> items;

	public ShoppingCart(){
		this.items=new ArrayList<Item>();
	}

	// GOOD: Code now uses strategy pattern.
	// This code does not need to be changed even if
	// we introduce a new strategy in the future,
	// for example, Apple pay.
	public void pay(IPaymentStrategy paymentMethod){
		int amount = calculateTotal();
		paymentMethod.pay(amount);
	}

	public void addItem(Item item){
		this.items.add(item);
	}

	public int calculateTotal(){
		int sum = 0;
		for(Item item : items){
			sum += item.getPrice();
		}
		return sum;
	}

}