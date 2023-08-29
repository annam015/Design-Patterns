package facade.classes;

import java.time.LocalDate;

public class HealthCard {
	private int code;
	private String name;
	private LocalDate expDate;
	
	public HealthCard(int code, String name, LocalDate expDate) {
		this.code = code;
		this.name = name;
		this.expDate = expDate;
	}
	
	public boolean verifyCard() {
        return expDate.isAfter(LocalDate.now());
	}
	
}