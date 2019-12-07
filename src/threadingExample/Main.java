package threadingExample;

public class Main {

	public static void main(String[] args) {		
		Thread a = new Thread(new Runnable() {
			@Override
			public void run() {
				test("A is using");
			}
		});
		
		Thread b = new Thread(new Runnable() {
			@Override
			public void run() {
				test("B is using");
			}
		});
		

		a.start();
		b.start();
		
		test("C");
		
	}
	
	public static synchronized void test(String a) {
		for (int i=0;i<10;i++) {
			System.out.println(a + ", " + i);
		}
	}
}