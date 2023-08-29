package template.main;

import template.classes.*;

public class TemplateMain {

	public static void main(String[] args) {
		AtmWithdrawal atmWithdrawal = new AtmWithdrawal();
		
		CreditCard creditCard1 = new CreditCard("Jack", "1234567890123456", "4513", 1949);		
		atmWithdrawal.withdraw(creditCard1);
	}

}