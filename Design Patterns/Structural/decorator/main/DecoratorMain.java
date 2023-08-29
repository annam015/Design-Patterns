package decorator.main;

import java.time.LocalDate;

import decorator.classes.*;

public class DecoratorMain {

	public static void main(String[] args) {
		
		Stadium stadium1 = new Stadium("Starlight Stadium", "123 Main Street, Cityville", "Cityville Football Club");
		Stadium stadium2 = new Stadium("Victory Arena", "456 Victory Lane, Sportstown", "Sportstown Strikers");
		
		FootballMatch footballMatch1 = new FootballMatch("Sportstown Strikers", "Phoenix United", stadium2, LocalDate.of(2023, 5, 10));
		FootballMatch footballMatch2 = new FootballMatch("Sportstown Strikers", "Cityville Football Club", stadium1, LocalDate.of(2023, 5, 12));
		FootballMatch footballMatch3 = new FootballMatch("Cityville Football Club", "Phoenix United", stadium1, LocalDate.of(2023, 5, 15));
		FootballMatch footballMatch4 = new FootballMatch("Phoenix United", "Silver Tigers", stadium2, LocalDate.of(2023, 5, 17));
		
		// without decorator
		Ticket ticket1 = new Ticket("John Smith", footballMatch1);
		Ticket ticket2 = new Ticket("Sarah Doe", footballMatch2);
		Ticket ticket3 = new Ticket("Emily Lawson", footballMatch3);
		Ticket ticket4 = new Ticket("Lucas Rivera", footballMatch4);	
		
		ticket1.printTicket();
		ticket2.printTicket();
		ticket3.printTicket();
		ticket4.printTicket();
		
		System.out.println("\n******************************************\n");
		
		// with decorator
		DecoratorTicket ticket5 = new DecoratorTicket(ticket1);
		DecoratorTicket ticket6 = new DecoratorTicket(ticket2);
		DecoratorTicket ticket7 = new DecoratorTicket(ticket3);
		DecoratorTicket ticket8 = new DecoratorTicket(ticket4);
		
		ticket5.printTicket();
		ticket6.printTicket();
		ticket7.printTicket();
		ticket8.printTicket();
	}
	
}