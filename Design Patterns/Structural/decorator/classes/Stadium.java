package decorator.classes;

public class Stadium {
	private String name;
	private String address;
	private String team;
	
	public Stadium(String name, String address, String team) {
		this.name = name;
		this.address = address;
		this.team = team;
	}

	public String getName() {
		return name;
	}

	public String geAddress() {
		return address;
	}

	public String getTeam() {
		return team;
	}
	
}