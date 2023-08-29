package memento.classes;

public class TravelPackage {
	private String name;
	private double price;
	
	public TravelPackage(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "TravelPackage [name = " + name + ", price = " + price + "]";
	}
	
	public MementoTravelPackage saveMemento() {
		return new MementoTravelPackage(name, price);
	}
	
	public void undoMemento(MementoTravelPackage memento) {
		this.name = memento.getName();
		this.price = memento.getPrice();
	}
}