package decorator.classes;

public class DecoratorTicket implements ITicket {
	private Ticket ticket;
	
	public DecoratorTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	@Override
	public void printTicket() {
		if(ticket.getFootballMatch().getHomeTeam().equals(ticket.getFootballMatch().getStadium().getTeam())) {
			System.out.println("-----------------------------------------");
			System.out.println("Name: " + ticket.getName() + "\nHome team: " + ticket.getFootballMatch().getHomeTeam() + "\nAway team: " +
			ticket.getFootballMatch().getAwayTeam() + "\nStadium: " + ticket.getFootballMatch().getStadium().getName() + "\nAddress: " + 
			ticket.getFootballMatch().getStadium().geAddress() + "\nDate: " + ticket.getFootballMatch().getDate() + "\n");
			System.out.println("GO, " + ticket.getFootballMatch().getHomeTeam().toUpperCase() + ", YOU'VE GOT THIS!");
			System.out.println("BRING HOME THE VICTORY!");
			System.out.println("-----------------------------------------");
		} else {
			ticket.printTicket();
		}
	}
}