package factory_method.classes;

public class Pharmacist implements IHospitalStaff {
	
	private String name;
	
	public Pharmacist(String name) {
		this.name = name;
	}

	@Override
	public void describe() {
		System.out.println("Pharmacist - name: " + this.name);		
	}
	
}