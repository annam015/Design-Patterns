package chain_of_responsability.classes;

public interface ISubject {
	void sendNotification(String message);
	void addObserver(IObserver observer);
	void deleteObserver(IObserver observer);
}