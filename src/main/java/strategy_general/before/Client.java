package strategy_general.before;

public class Client {
	public static void main(String[] args) {
		Context context = new Context();
		System.out.println("Calling algorithm1 = "
				+ context.doSomething("algorithm1", "sang ", "shin"));
		System.out.println("Calling algorithm2 = "
				+ context.doSomething("algorithm2", "jpassion ", "com"));
	}
}
