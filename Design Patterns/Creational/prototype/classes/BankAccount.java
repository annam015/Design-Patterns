package prototype.classes;

public class BankAccount implements IBankAccount {
	private Client client;
	private String IBAN;
	
	public BankAccount(Client client, String IBAN) {
		this.client = client;
		this.IBAN = IBAN;
	}
	
	public void setIBAN(String IBAN) {
		this.IBAN = IBAN;
	}
	
	@Override
	public IBankAccount clone() {
		IBankAccount bankAccountClone = new BankAccount(this.client, this.IBAN);		
		return bankAccountClone;
	}

	@Override
	public String toString() {
		return "Bank Account - client name: " + this.client.getName() + ", age: " + this.client.getAge() + ", IBAN: " + this.IBAN;
	}
}