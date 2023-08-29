package adapter.classes.old_soft;

import java.util.List;

public class KitchenOrder implements IKitchenPrinter{
	
	private String chef;
	
	public KitchenOrder(String chefName) {
		this.chef = chefName;
	}
	
	@Override
	public void printKitchenOrder(List<String> order) {
		System.out.println("!!! NEW ORDER !!!");
		for(String o : order) {
			System.out.println("---> " + o);
		}		
		System.out.println("Must be prepared by " + this.chef + "\n");
	}

}