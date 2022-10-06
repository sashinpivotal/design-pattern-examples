package builder_car.after;

class Client {

	public static void main(String[] args) {
	
		// The Builder Pattern allows you to build complex
		// objects in a series of steps. 
		CarBuilder carBuilder = new CarBuilder();
		Car carA = carBuilder.newCar()
		                      .addEngine("fast engine")
		                      .addTires("fast tires")
		                      .addExhaust("fast exhaust")
		                      .addDoor("fast door")
		                      .getCar();
        System.out.println("Car = " + carA);
		
		carBuilder.newCar()
		          .addEngine("fancy engine")
		          .addTires("fancy tires")
		          .addExhaust("fancy exhaust")
		          .addDoor("fancy door")
		          .addSunroof("fancy sunroof");
		Car carB = carBuilder.getCar();
		System.out.println("Car = " + carB);
		
	}
}
