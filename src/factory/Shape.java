package factory;

public class Shape {

	public static enum Type { TRIANGLE, SQUARE }
	
	protected Shape(Type type) { }
	
	public static Shape createShape(Type type) {
		Shape s = null;
		
		if (type == Type.TRIANGLE) {
			s = new Triangle(type);
		} else if (type == Type.SQUARE) {
			s = new Square(type);
		}
		
		return s;
	}
	
}