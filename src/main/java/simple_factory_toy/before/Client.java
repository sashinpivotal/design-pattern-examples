package simple_factory_toy.before;

public class Client {
	
	public static void main(String[] args) {
		
		String toyToCreate = "car";
		Toy toy;
		
		if (args.length == 1){
			toyToCreate = args[0];
		}
		
		// BAD: Business logic is mixed up with object creation
		switch (toyToCreate) {
		case "car":
			toy = new CarToy();
			break;
		case "train":
			toy = new TrainToy();
			break;
		default:
			toy = null;
		}
		
		// Business logic
		toy.doSomethingWithToy();
	}

}
