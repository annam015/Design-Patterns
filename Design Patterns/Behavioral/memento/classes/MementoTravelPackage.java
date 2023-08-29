package memento.classes;

public class MementoTravelPackage {
	private String name;
	private double price;
	
	public MementoTravelPackage(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		return this.price;
	}
}