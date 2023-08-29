package observer.classes;

public class Patient implements IObserver {
	private String name;
	
	public Patient(String name) {
		this.name = name;
	}

	
	@Override
	public void receiveNotification(String message) {
		System.out.println(this.name + " received the following message: " + message);		
	}

}