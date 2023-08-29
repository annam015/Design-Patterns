package adapter.classes.new_soft;

import java.util.List;

import adapter.classes.old_soft.KitchenOrder;

public class Adapter extends KitchenOrder implements IBarPrinter {

	public Adapter(String name) {
		super(name);
	}

	@Override
	public void printBarOrder(List<String> order) {
		super.printKitchenOrder(order);
	}

}