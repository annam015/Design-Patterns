package facade.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Prescription {	
	private String code;
	private Map<String, Integer> medicine;
	private static List<Prescription> prescriptions = new ArrayList<Prescription>();
	
	public Prescription(String code, Map<String, Integer> medicine) {
		this.code = code;
		this.medicine = medicine;
		Prescription.prescriptions.add(this);
	}
	
	public static Map<String, Integer> verifyPrescription(String s) {
		for(Prescription p : prescriptions) {
			if(p.code.equals(s)) {
				return p.medicine;
			}
		}
		return null;
	}
}