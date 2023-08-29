package chain_of_responsability.main;

import chain_of_responsability.classes.*;

public class ChainOfResponsabilityMain {

	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant();
		
		Customer customer1 = new Customer("John", "0723456789", "john@gmail.com");
		Customer customer2 = new Customer("Jack", null, "jack@gmail.com");
		Customer customer3 = new Customer("Jann", null, null);

		restaurant.addObserver(customer1);
		restaurant.addObserver(customer2);
		restaurant.addObserver(customer3);
		
		restaurant.sendNotification("Join us tomorrow between 8 and 10 PM for a special surprise! We have a live guest performer, and you're invited.");
	}

}