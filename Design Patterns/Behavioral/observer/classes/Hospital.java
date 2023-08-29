package observer.classes;

import java.util.ArrayList;
import java.util.List;

public class Hospital implements IObservable {
	private String name;
	private List<IObserver> subscribers;
	
	public Hospital(String name) {
		this.name = name;
		subscribers = new ArrayList<IObserver>();
	}
	
	@Override
	public void addObserver(IObserver observer) {
		subscribers.add(observer);		
	}

	@Override
	public void deleteObserver(IObserver observer) {
		subscribers.remove(observer);		
	}

	@Override
	public void notifyObserver(String message) {
		for(IObserver o : subscribers) {
			o.receiveNotification(this.name + ": " + message);
		}		
	}
}