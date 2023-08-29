package factory_method.classes;

public class Nurse implements IHospitalStaff {	
	
	private String name;
	
	public Nurse(String name) {
		this.name = name;
	}

	@Override
	public void describe() {
		System.out.println("Nurse - name: " + this.name);		
	}
	
}