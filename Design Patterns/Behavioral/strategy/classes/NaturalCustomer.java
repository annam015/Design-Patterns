package strategy.classes;

public class NaturalCustomer implements ICustomerType {

	@Override
	public void checkDocuments(String name) {
		System.out.println("For " + name + " - check ID card and proof of employment.");
	}

}