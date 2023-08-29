package strategy.classes;

public class Customer {	
	private String name;
	private ICustomerType customerType;
	
	public Customer(String name, ICustomerType customerType) {
		this.name = name;
		this.customerType = customerType;
	}
	
	public void check() {
		this.customerType.checkDocuments(this.name);
	}
}