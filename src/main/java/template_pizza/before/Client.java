package template_pizza.before;

public class Client {
	public static void main(String[] args) {

		NewYorkPizza newYorkPizza = new NewYorkPizza("Cheeze Pizza");
		newYorkPizza.handleOrder();
		
		ChicagoPizza chicagoPizza = new ChicagoPizza("Pepperoni Pizza");
		chicagoPizza.handleOrder();

	}
}
