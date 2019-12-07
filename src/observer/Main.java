package observer;

public class Main {

	public static void main(String[] args) {
		Observer observer1 = new Observer();
		Observer observer2 = new Observer();
		Observer observer3 = new Observer();
		Observer observer4 = new Observer();
		Observable observable = new Observable();
		
		observable.addObserver(observer1);
		observable.addObserver(observer2);
		observable.addObserver(observer3);
		observable.addObserver(observer4);
		
		observable.increaseCount();
		
	}
	
}