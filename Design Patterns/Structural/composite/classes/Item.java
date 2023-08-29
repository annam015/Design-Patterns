package composite.classes;

public class Item implements AbstractComponent{
	private int code;
	private String name;
	private double price;
	
	public Item(int code, String name, double price) {
		this.code = code;
		this.name = name;
		this.price = price;
	}

	@Override
	public void describe() throws Exception {
		System.out.println("Item - code: " + this.code + ", name: " + this.name + ", price: " + this.price);
	}

	@Override
	public void addComponent(AbstractComponent component) throws Exception {
		throw new Exception("Not applicable");
	}

	@Override
	public void deleteComponent(AbstractComponent component) throws Exception {
		throw new Exception("Not applicable");
	}

	@Override
	public AbstractComponent getComponent(int index) throws Exception {
		throw new Exception("Not applicable");
	}
}