package template_pizza.after;

public class Client {
	public static void main(String[] args) {

		Pizza pizza = new NewYorkPizza("Cheeze Pizza");
		pizza.handleOrder();
		
		pizza = new ChicagoPizza("Pepperoni Pizza");
		pizza.handleOrder();
	}
}
