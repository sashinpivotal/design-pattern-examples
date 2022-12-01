package strategy_payment.before;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public int calculateTotalPrice() {
        int totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    // BAD: If new payment method needs to be supported,
    // this code needs to be modified, which violates
    // "Open-Closed" design principle.
    public void pay(String paymentMethod) {
        int amount = calculateTotalPrice();

        if (paymentMethod.equals("paypal")) {
            new Paypal("myemail@example.com", "mypwd")
                    .pay(amount);
        } else if (paymentMethod.equals("credit-card")){
            new CreditCard("Sang Shin",
                    "1234567890123456",
                    "786",
                    "12/15")
                    .pay(amount);
        }
    }
}