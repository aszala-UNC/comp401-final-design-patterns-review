package decatator;

public class Main {
	
	public static void main(String[] args) {
		Shape s = new Triangle();
		
		Triangle newTriangle = new Triangle(s);
		
		Shape o = newTriangle.getOriginal();
		
		Equalterial a = new Equalterial(newTriangle);
		
		Shape sameO = a.getOriginal();
		
		boolean equals1 = s == o;
		boolean equals2 = o == sameO;
		boolean equals3 = o == ((Triangle)sameO).getOriginal();
		
		System.out.println(equals1 + ", " + equals2 + ", " + equals3);
		
	}
	
}