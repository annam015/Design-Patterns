package prototype.main;

import prototype.classes.*;

public class PrototypeMain {
	
	public static void main(String[] args) {
		
		BankAccount bankAccount1 = new BankAccount(new Client("George", 32), "RO88RZBR5911665974427153");
		BankAccount bankAccount2 = new BankAccount(new Client("John", 52), "FR2630003000402779294428D85");
		BankAccount bankAccount3 = new BankAccount(new Client("Anna", 22), "BR1873211151541957244868144Y6");
		
		BankAccount bankAccount4 = (BankAccount)bankAccount1.clone();
		bankAccount4.setIBAN("AE920266929191676665249");
		
		BankAccount bankAccount5 = (BankAccount)bankAccount3.clone();
		bankAccount5.setIBAN("RO24RZBR8196525654621559");
		
		System.out.println(bankAccount1.toString()); 
		System.out.println(bankAccount2.toString());
		System.out.println(bankAccount3.toString());
		System.out.println(bankAccount4.toString());
		System.out.println(bankAccount5.toString());
		
	}
	
}