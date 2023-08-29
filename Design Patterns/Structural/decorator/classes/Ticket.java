package decorator.classes;

public class Ticket implements ITicket {
	private String name;
	private FootballMatch footballMatch;
	
	public Ticket(String name, FootballMatch footballMatch) {
		this.name = name;
		this.footballMatch = footballMatch;
	}
	
	public String getName() {
		return this.name;
	}
	
	public FootballMatch getFootballMatch() {
		return this.footballMatch;
	}
	
	@Override
	public void printTicket() {
		System.out.println("-----------------------------------------");
		System.out.println("Name: " + this.name + "\nHome team: " + this.footballMatch.getHomeTeam() + "\nAway team: " +
				this.footballMatch.getAwayTeam() + "\nStadium: " + this.footballMatch.getStadium().getName() + "\nAddress: " + 
				this.footballMatch.getStadium().geAddress() + "\nDate: " + this.footballMatch.getDate());
		System.out.println("-----------------------------------------");
	}

}