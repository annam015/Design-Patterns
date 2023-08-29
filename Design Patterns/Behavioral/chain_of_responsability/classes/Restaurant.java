package chain_of_responsability.classes;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements ISubject {
	List<IObserver> observers;
	
	public Restaurant() {
		observers = new ArrayList<IObserver>();
	}
	
	@Override
	public void sendNotification(String message) {
		SmsNotificator smsNotificator = new SmsNotificator();
		EmailNotificator emailNotificator = new EmailNotificator();
		ManagerNotificator managerNotificator = new ManagerNotificator();
		
		smsNotificator.setSuccessor(emailNotificator);
		emailNotificator.setSuccessor(managerNotificator);
		
		for(IObserver observer : observers) {
			smsNotificator.notify((Customer)observer, message);
		}
	}

	@Override
	public void addObserver(IObserver observer) {
		observers.add(observer);		
	}

	@Override
	public void deleteObserver(IObserver observer) {
		observers.remove(observer);		
	}
}