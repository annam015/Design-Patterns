package factory_method.classes;

public class Doctor implements IHospitalStaff {
	
	private String name;
	
	public Doctor(String name) {
		this.name = name;
	}

	@Override
	public void describe() {
		System.out.println("Doctor - name: " + this.name);		
	}
	
}