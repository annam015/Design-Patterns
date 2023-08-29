package adapter.classes.new_soft;

import java.util.List;

public class BarOrder implements IBarPrinter{

	private String bartender;
	
	public BarOrder(String bartender) {
		this.bartender = bartender;
	}
	
	@Override
	public void printBarOrder(List<String> order) {
		System.out.println("Bartender " + this.bartender + " must prepare: ");
		for(String o : order) {
			System.out.println(o);
		}
		System.out.println();
	}

}