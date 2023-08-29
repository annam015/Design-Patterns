package chain_of_responsability.classes;

public interface IObserver {
	void receiveSMS(String sms);
	void receiveEmail(String email);
}