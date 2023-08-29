package chain_of_responsability.classes;

public class SmsNotificator extends Notificator {

	@Override
	public void notify(Customer customer, String message) {
		if(customer.getPhoneNumber() != null) {
			customer.receiveSMS(message);
		} else {
			super.getSuccessor().notify(customer, message);
		}
	}

}