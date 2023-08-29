package decorator.classes;

import java.time.LocalDate;

public class FootballMatch {
	private String homeTeam;
	private String awayTeam;
	private Stadium stadium;
	private LocalDate date;
	
	public FootballMatch(String homeTeam, String awayTeam, Stadium stadium, LocalDate date) {
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
		this.stadium = stadium;
		this.date = date;
	}

	public String getHomeTeam() {
		return homeTeam;
	}

	public String getAwayTeam() {
		return awayTeam;
	}

	public Stadium getStadium() {
		return stadium;
	}

	public LocalDate getDate() {
		return date;
	}
	
}