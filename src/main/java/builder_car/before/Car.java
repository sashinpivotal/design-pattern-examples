package builder_car.before;

public class Car {
	private String engine;
	private String tires;
	private String exhaust;
	private String door;
	private String sunroof;
	
	public Car(String engine, String tires, String exhaust, String door, String sunroof) {
		this.engine = engine;
		this.tires = tires;
		this.exhaust = exhaust;
		this.door = door;
		this.sunroof = sunroof;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public void setTires(String tires) {
		this.tires = tires;
	}

	public void setExhaust(String exhaust) {
		this.exhaust = exhaust;
	}
	
	public void setDoor(String door) {
		this.door = door;
	}

	public void setSunroof(String sunroof) {
		this.sunroof = sunroof;
	}
	
	@Override
	public String toString(){
		return engine + " " + tires + " " + exhaust + " " + door + " " + sunroof;
	}
}