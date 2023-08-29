package template.classes;

import java.util.Scanner;

public class AtmWithdrawal {
	
	public void withdraw(CreditCard creditCard) {
		if(verifyPin(creditCard)) {
			System.out.println("Enter the amount:");
			try (Scanner scanner = new Scanner(System.in)) {
				int amount = scanner.nextInt();
				if(verifyBalance(creditCard, amount)) {
					modifyBalance(creditCard, amount);
					System.out.println("The withdrawal was successful! \nAmount: " + amount + "\nCard: **** **** **** " + creditCard.getCardNumber().substring(creditCard.getCardNumber().length() - 4) + 
							"\nCardholder: " + creditCard.getCardHolderName() + "\nNew balance: " + creditCard.getBalance());
				} else {
					System.out.println("Insufficient funds!");
				}
			} catch (Exception e) {
				System.out.println("Error!");
			}
		} else {
			System.out.println("The PIN is incorrect!");
		}
	}
	
	private boolean verifyPin(CreditCard creditCard) {
		System.out.println("Enter the pin:");
		String pin = "";
		Scanner scanner = new Scanner(System.in);
		pin = scanner.nextLine();
		if(pin.length() == 4 && pin.equals(creditCard.getPin())) {
			return true;
		}
		return false;
	}
	
	private boolean verifyBalance(CreditCard creditCard, int amount) {		
		if(amount <= creditCard.getBalance()) {
			return true;
		}
		return false;
	}
	
	private void modifyBalance(CreditCard creditCard, int amount) {
		creditCard.setBalance(creditCard.getBalance() - amount);
	}
}