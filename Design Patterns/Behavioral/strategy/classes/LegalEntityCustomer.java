package strategy.classes;

public class LegalEntityCustomer implements ICustomerType {

	@Override
	public void checkDocuments(String name) {
		System.out.println("For " + name + " - check the founding documents of the company and proof of registration at the Trade Registry.");
	}

}