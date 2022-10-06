package singleton;

public class Client {
	public static void main(String[] args) {

		// You cannot directly instantiate a singleton object
		// because the constructor is private.
		// Singleton object = new Singleton();

		// Retrieve the singleton object
		Singleton singleton = Singleton.getInstance();

		singleton.addNumberToCounter(5);
		singleton.subtractNumberFromCounter(2);
		System.out.println("counter = " + singleton.getCounter());
		
		// Observe that you always the same Singleton object
		Singleton singleton2 = Singleton.getInstance();
		
		singleton2.addNumberToCounter(1);
		System.out.println("counter = " + singleton2.getCounter());
	}
}
