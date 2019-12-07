package decatator;

public class Triangle implements Shape {

	private Shape original;
	
	public Triangle() {
		
	}
	
	public Triangle(Shape original) {
		this.original = original;
	}
	
	public Shape getOriginal() {
		return original;
	}
	
	void area() {
		
	}
	
	@Override
	public void fill() {
		System.out.println("Yeet");
	}
	
}
