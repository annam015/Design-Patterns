package chain_of_responsability.classes;

public class Customer implements IObserver {
	private String name;
	private String phoneNumber;
	private String email;
	
	public Customer(String name, String phoneNumber, String email) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	@Override
	public void receiveSMS(String sms) {
		System.out.println(this.name + " received the following sms: " + sms);		
	}

	@Override
	public void receiveEmail(String email) {
		System.out.println(this.name + " received the following email: " + email);		
	}
}