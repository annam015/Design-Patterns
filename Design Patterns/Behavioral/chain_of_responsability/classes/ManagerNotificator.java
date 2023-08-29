package chain_of_responsability.classes;

public class ManagerNotificator extends Notificator {

	@Override
	public void notify(Customer customer, String message) {
		System.out.println(customer.getName() + " did not provide contact information!");		
	}

}