package proxy.classes;

public class Person {
	private String name;
	private boolean hasMedicalInsurance;
	
	public Person(String name, boolean hasMedicalInsurance) {
		this.name = name;
		this.hasMedicalInsurance = hasMedicalInsurance;
	}

	public String getName() {
		return name;
	}

	public boolean getHasMedicalInsurance() {
		return hasMedicalInsurance;
	}
}