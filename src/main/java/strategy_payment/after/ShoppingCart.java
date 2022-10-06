package strategy_payment.after;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	List<Item> items;

	public ShoppingCart(){
		this.items=new ArrayList<Item>();
	}
	
	// Strategy object is passed as an argument
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