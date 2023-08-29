package template.classes;

public class CreditCard {
	private String cardHolderName;
	private String cardNumber;
	private String pin;
	private int balance;
	
	public CreditCard(String cardHolderName, String cardNumber, String pin, int balance) {
		this.cardHolderName = cardHolderName;
		this.cardNumber = cardNumber;
		this.pin = pin;
		this.balance = balance;
	}
	
	public String getCardHolderName() {
		return this.cardHolderName;
	}
	
	public String getCardNumber() {
		return this.cardNumber;
	}
	
	public String getPin() {
		return this.pin;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public void setBalance(int amount) {
		this.balance = amount;
	}
}