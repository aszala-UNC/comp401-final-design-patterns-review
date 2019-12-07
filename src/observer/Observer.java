package observer;

public class Observer implements Listener {

	public Observer() {
		
	}
	
	@Override
	public void handleEvent(Observable o) {
		System.out.println("Yeet: " + o.getCount());
	}

}
