package chain_of_responsability.classes;

public class EmailNotificator extends Notificator {

	@Override
	public void notify(Customer customer, String message) {
		if(customer.getEmail() != null) {
			customer.receiveEmail(message);
		} else {
			super.getSuccessor().notify(customer, message);
		}
	}

}