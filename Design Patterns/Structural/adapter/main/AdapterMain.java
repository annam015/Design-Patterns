package adapter.main;

import java.util.ArrayList;
import java.util.List;

import adapter.classes.new_soft.Adapter;
import adapter.classes.new_soft.BarOrder;
import adapter.classes.old_soft.KitchenOrder;

public class AdapterMain {
	
	public static void print(KitchenOrder kitchenOrder, List<String> order) {
		kitchenOrder.printKitchenOrder(order);
	}
	
	public static void main(String[] args) {
		
		List<String> kitchenOrder = new ArrayList<String>();
		kitchenOrder.add("Grilled Salmon");
		kitchenOrder.add("Beef Tenderloin Steak");
		kitchenOrder.add("Spinach Ricotta Ravioli");
		
		KitchenOrder kitchen = new KitchenOrder("Jack");
		kitchen.printKitchenOrder(kitchenOrder);
				
		List<String> barOrder = new ArrayList<String>();
		barOrder.add("Margarita");
		barOrder.add("Aperol Spritz");
		barOrder.add("Old Fashioned");
		
		// without adapter
		BarOrder bar = new BarOrder("George");
		bar.printBarOrder(barOrder);
		
		System.out.println("****************************\n");
		
		// with adapter
		Adapter adapter = new Adapter("Sonia");
		AdapterMain.print(adapter, barOrder);
	}
	
}