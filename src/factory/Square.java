package factory;

public class Square extends Shape {

	public Square(Shape.Type type) {
		super(type);
	}
	
	public void squareTest() {
		System.out.println("Square Test");
	}
	
}