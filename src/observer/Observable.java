package observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {

	private List<Listener> listeners;
	
	private int count = 0;
	
	public Observable() {
		listeners = new ArrayList<>();
	}
	
	public void increaseCount() {
		count++;
		
		notifyObversers();
	}
	
	private void notifyObversers() {
		for (Listener ls : listeners) {
			ls.handleEvent(this);
		}
	}
	
	public void addObserver(Listener listener) {
		listeners.add(listener);
	}
	
	public int getCount() {
		return count;
	}
	
}
