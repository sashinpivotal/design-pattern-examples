package simple_factory_toy.after;

public class Client {
	
	public static void main(String[] args) {
		
		String toyToCreate = "car";
		if (args.length == 1){
			toyToCreate = args[0];
		}
		
		// GOOD: Object creation is delegated to a simple factory
		Toy toy = SimpleToyFactory.createToy(toyToCreate);
		
		// GOOD: Business logic is not mixed up with object creation detail
		toy.doSomethingWithToy();
		
	}

}
