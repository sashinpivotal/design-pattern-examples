package template_pizza.after;

public abstract class Pizza {
	
	private String name;
	
	public Pizza(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	abstract void prepare();
	abstract void addTopping();
	abstract void bake();
	abstract void serve();

	// GOOD: common concrete behavior can be captured
	// By making it final method, subclass cannot override it.
	private final void takePayment() {
		System.out.println("Take payment");
	}
	
	// GOOD: template method defines way of
	// executing methods. Note that this method is
	// final, which means child class cannot override it.
	public final void handleOrder() {
		takePayment();
		prepare();
		addTopping();
		bake();
		serve();
	}

}
