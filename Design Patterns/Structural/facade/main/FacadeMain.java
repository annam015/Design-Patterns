package facade.main;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import facade.classes.*;

public class FacadeMain {

	public static void main(String[] args) {
		
		Stock pharmacyStock = new Stock();
		
		HealthCard card1 = new HealthCard(10015, "Mira Smith", LocalDate.of(2023, 3, 3));
		HealthCard card2 = new HealthCard(10015, "Mira Smith", LocalDate.of(2025, 10, 3));
		
		Map<String, Integer> medicine1 = new HashMap<String, Integer>();
		medicine1.put("Ibuprofen", 2);
		medicine1.put("Paracetamol", 1);		
		Prescription prescription1 = new Prescription("AM1256RK", medicine1);
		
		Map<String, Integer> medicine2 = new HashMap<String, Integer>();
		medicine2.put("Aspirin", 3);
		Prescription prescription2 = new Prescription("UM8930ZY", medicine2);		
		
		System.out.println(Facade.verify("UM8930ZY", card1));
		System.out.println(Facade.verify("UM8930ZY", card2));
		System.out.println(Facade.verify("AM1256RK", card2));
		
		pharmacyStock.addProducts("Aspirin", 5);
		System.out.println(Facade.verify("UM8930ZY", card2));
	}

}