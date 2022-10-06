package simple_factory_toy.after;

// GOOD: This is the factory class where we create a Toy.
// This is the only part of the application that refers
// to the concrete classes.
public class SimpleToyFactory {

	public static Toy createToy(String toyToCreate) {

		Toy toy;

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

		return toy;

	}
}
