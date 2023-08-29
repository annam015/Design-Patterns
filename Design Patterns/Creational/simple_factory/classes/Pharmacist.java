package simple_factory.classes;

public class Pharmacist implements IHospitalStaff {

	private String name;
	
	protected Pharmacist(String name) {
		this.name = name;
	}
	
	@Override
	public void describe() {
		System.out.println("Pharmacist - name: " + name);		
	}

}