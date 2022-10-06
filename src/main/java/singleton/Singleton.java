package singleton;

public class Singleton {

	private int counter = 0;
	
	// Create only instance that is available
	private static Singleton instance;

	// Make constructor private to prevent direct instantiation
	private Singleton() {
	}

	// Return singleton object
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	public void addNumberToCounter(int number) {
		counter += number;
	}

	public void subtractNumberFromCounter(int number) {
		counter -= number;
	}

	public int getCounter() {
		return counter;
	}

}
