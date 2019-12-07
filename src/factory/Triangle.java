package factory;

public class Triangle extends Shape {
	
	protected Triangle(Shape.Type type) {
		super(type);
	}
	
	public void triangleTest() {
		System.out.println("Triangle Test");
	}
	
}
