package builder_car.after;

public class CarBuilder {
	
	private Car car;
	
	public Car getCar(){
		return car;
	}
	
	public CarBuilder newCar(){
		car = new Car();
		return this;
	}
	
	public CarBuilder addEngine(String engine){
		car.setEngine(engine);
		return this;
	}
	
	public CarBuilder addTires(String tires){
		car.setTires(tires);
		return this;
	}
	
	public CarBuilder addExhaust(String exhaust){
		car.setExhaust(exhaust);
		return this;
	}
	
	public CarBuilder addDoor(String door){
		car.setDoor(door);
		return this;
	}
	
	public CarBuilder addSunroof(String sunroof){
		car.setSunroof(sunroof);
		return this;
	}

}
