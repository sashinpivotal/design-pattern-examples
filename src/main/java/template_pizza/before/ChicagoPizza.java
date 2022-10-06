package template_pizza.before;

public class ChicagoPizza extends Pizza {
	
	public ChicagoPizza(String name) {
		super(name);
	}

	void prepare() {
		System.out.println("Prepare " + getName() + " in Chicago style");
	}

	void addTopping() {
		System.out.println("Add topping " + getName() + " in Chicago style");
	}

	void bake() {
		System.out.println("Bake " + getName() + " in Chicago style");
	}

	void serve() {
		System.out.println("Serve " + getName() + " in Chicago style");
	}
	
	// BAD: duplicate code
	public void takePayment() {
		System.out.println("Take payment");
	}
	
	// BAD: We wanted both NewYork pizza and Chicago pizza
	// to take the same steps to make.  But here There is no way 
	// impose common behavior - for example, in Chicago, the step of bake()
	// is omitted below. Also, "addTopping" step is done before "prepare" step.
	// pizza.bake();
	public void handleOrder(){
		takePayment();
		addTopping();
		prepare();
	}

}

