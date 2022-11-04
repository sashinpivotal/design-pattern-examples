package strategy_general.after;

public class Client {
	public static void main(String[] args) {

		// Configure context object with concrete strategy object during runtime
		Context context = new Context(callBusinessMethod());
		
		// Execute a particular strategy
		System.out.println("Calling Operation1 = "
				+ context.executeStrategy("sang ", "shin"));

		// Configure context object with concrete strategy object during runtime
		context = new Context(callBusinessMethod());
		
		// Execute a particular strategy
		System.out.println("Calling Operation2 = "
				+ context.executeStrategy("jpassion ", "com"));
	}

	private static IStrategy callBusinessMethod() {
		boolean b = true;
		IStrategy iStrategy = b ? new ConcreteStrategy1() : new ConcreteStrategy2();
		return iStrategy;
	}
}
