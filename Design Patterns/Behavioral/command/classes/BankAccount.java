package command.classes;

public class BankAccount implements IBankAccount {
	private String iban;
	private String holderName;
	private int balance;
	
	public BankAccount(String iban, String holderName) {
		this.iban = iban;
		this.holderName = holderName;
		this.balance = 0;
	}	
	
	public int getBalance() {
		return this.balance;
	}

	@Override
	public void withdraw(int amount) {
		if(amount <= this.balance) {
			this.balance -= amount;
			System.out.println("The withdrawal (" + amount + ") from account " + this.iban + " owned by " + this.holderName + " was successful!");
		} else {
			System.out.println("Insufficient funds!");
		}
	}

	@Override
	public void deposit(int amount) {
		this.balance += amount;
		System.out.println("The deposit (" + amount + ") from account " + this.iban + " owned by " + this.holderName + " was successful!");
	}	
}