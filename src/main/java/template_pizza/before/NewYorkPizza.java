package template_pizza.before;

public class NewYorkPizza extends Pizza {

	public NewYorkPizza(String name) {
		super(name);
	}

	void prepare() {
		System.out.println("Prepare " + getName() + " in New York style");
	}

	void addTopping() {
		System.out.println("Add topping " + getName() + " in New York style");
	}

	void bake() {
		System.out.println("Bake " + getName() + " in New York style");
	}

	void serve() {
		System.out.println("Serve " + getName() + " in New York style");
	}
	
	// BAD: duplicate code of takePayment method in both
	// ChicagoPizza and NewYorkPizza class
	public void takePayment() {
		System.out.println("Take payment");
	}
	
	public void handleOrder(){
		takePayment();
		prepare();
		addTopping();
		bake();
		serve();
	}

}
