package factory;

public class Car {

	private static Car car;
	
	private Car() { }
	
	public static Car createCar() {
		if (car == null) {
			car = new Car();
		}
		
		return car;
	}
	
}