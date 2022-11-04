package template_pizza.after;

public class NewYorkPizza extends PizzaWithTemplatePattern {

	public NewYorkPizza(String name) {
		super(name);
	}

	@Override
	void prepare() {
		System.out.println("Prepare " + getName() + " in New York style");
	}

	@Override
	void addTopping() {
		System.out.println("Add topping " + getName() + " in New York style");
	}

	@Override
	void bake() {
		System.out.println("Bake " + getName() + " in New York style");
	}

	@Override
	void serve() {
		System.out.println("Serve " + getName() + " in New York style");
	}

}
