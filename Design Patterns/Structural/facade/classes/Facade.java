package facade.classes;

import java.util.Map;

public class Facade {
	
	public static String verify(String prescriptionCode, HealthCard card) {
		if(!card.verifyCard()) {
			return "The health card is expired!";
		}
		if(Prescription.verifyPrescription(prescriptionCode) != null) { 
			Map<String, Integer> medicine = Prescription.verifyPrescription(prescriptionCode);
			for (String medName : medicine.keySet()) {
	            if(!Stock.verifyStock(medName, medicine.get(medName))) {
	            	return "There are products that are not in stock!";
	            }
	        }
		} else {
			return "The prescription is not valid!";
		}
		return "Everything looks good!";
	}
	
}