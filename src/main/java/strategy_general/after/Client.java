package strategy_general.after;

public class Client {
	public static void main(String[] args) {

		// Configure context object with concrete strategy object during runtime
		Context context = new Context(new ConcreteStrategy1());
		
		// Execute a particular strategy
		System.out.println("Calling Operation1 = "
				+ context.executeStrategy("sang ", "shin"));

		// Configure context object with concrete strategy object during runtime
		context = new Context(new ConcreteStrategy2());
		
		// Execute a particular strategy
		System.out.println("Calling Operation2 = "
				+ context.executeStrategy("jpassion ", "com"));
	}
}
