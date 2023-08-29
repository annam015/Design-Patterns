package facade.classes;

import java.util.HashMap;
import java.util.Map;

public class Stock {
	private static Map<String, Integer> pharmacyStock;
	
	public Stock() {
		pharmacyStock = new HashMap<String, Integer>();
		pharmacyStock.put("Ibuprofen", 5);
		pharmacyStock.put("Paracetamol", 3);
		pharmacyStock.put("Aspirin", 1);
	}
	
	public void addProducts(String medicine, int quantity) {
		if(pharmacyStock.containsKey(medicine)) {
            pharmacyStock.put(medicine, pharmacyStock.get(medicine) + quantity);
		} else {
			pharmacyStock.put(medicine, quantity);
		}
	}
	
	public static boolean verifyStock(String s, int q) {
		if(pharmacyStock.containsKey(s) && pharmacyStock.get(s) > q) {
			return true;
		}
		return false;
	}
}