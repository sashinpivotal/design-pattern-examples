package builder_car.before;

class Client {

	public static void main(String[] args) {
	
		// BAD: Create a car involves many constructor arguments,
		// all of which have to be provided
		Car carA = new Car("fast engine",
				"fast tires",
				"fast exhaust",
				"fast door",
				"no sunroof");
		System.out.println("Car = " + carA);
		
		// Create fancy car
		Car carB = new Car("fancy engine",
				"fancy tires",
				"fancy exhaust",
				"fancy door",
				"fancy sunroof");
		System.out.println("Car = " + carB);
	}
}
