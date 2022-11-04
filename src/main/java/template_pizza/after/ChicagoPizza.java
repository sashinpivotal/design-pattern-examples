package template_pizza.after;

public class ChicagoPizza extends PizzaWithTemplatePattern {
	
	public ChicagoPizza(String name) {
		super(name);
	}

	@Override
	void prepare() {
		System.out.println("Prepare " + getName() + " in Chicago style");
	}

	@Override
	void addTopping() {
		System.out.println("Add topping " + getName() + " in Chicago style");
	}

	@Override
	void bake() {
		System.out.println("Bake " + getName() + " in Chicago style");
	}

	@Override
	void serve() {
		System.out.println("Serve " + getName() + " in Chicago style");
	}

}

