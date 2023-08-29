package strategy.main;

import strategy.classes.*;

public class StrategyMain {

	public static void main(String[] args) {
		Customer customer1 = new Customer("Jack", new NaturalCustomer());
		customer1.check();
		
		Customer customer2 = new Customer("Rainbow Cup", new LegalEntityCustomer());
		customer2.check();
	}

}