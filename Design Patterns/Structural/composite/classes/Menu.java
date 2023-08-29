package composite.classes;

import java.util.ArrayList;
import java.util.List;

public class Menu implements AbstractComponent {
	private String name;
	private List<AbstractComponent> subitems;

	public Menu(String name) {
		this.name = name;
		this.subitems = new ArrayList<AbstractComponent>();
	}
	
	@Override
	public void describe() throws Exception {
		System.out.println("Menu - name: " + this.name + " contains " + subitems.size() + " items:");
		for (AbstractComponent abstractComponent : subitems) {
			abstractComponent.describe();
		}
		System.out.println();
	}

	@Override
	public void addComponent(AbstractComponent component) throws Exception {
		subitems.add(component);
	}

	@Override
	public void deleteComponent(AbstractComponent component) throws Exception {
		subitems.remove(component);
	}

	@Override
	public AbstractComponent getComponent(int index) throws Exception {
		return subitems.get(index);
	}
}