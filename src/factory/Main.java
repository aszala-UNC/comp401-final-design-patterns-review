package factory;

public class Main {

	public static void main(String[] args) {
		// Dynamic Subclass Binding
		
		Shape s = Shape.createShape(Shape.Type.TRIANGLE);
		Triangle t = (Triangle)s;
		
		t.triangleTest();
		
		Shape newS = Shape.createShape(Shape.Type.SQUARE);
		Square square = (Square)newS;
		
		square.squareTest();
		
		// Singleton
		Car carOne = Car.createCar();
		Car carTwo = Car.createCar();
		
		boolean equals = carOne == carTwo;
		
		System.out.println(equals);
	}
	
}