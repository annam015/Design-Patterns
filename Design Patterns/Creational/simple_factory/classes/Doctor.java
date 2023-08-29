package simple_factory.classes;

public class Doctor implements IHospitalStaff {
	
	private String name;
	private String specialty;
	
	protected Doctor(String name, String specialty) {
		this.name = name;
		this.specialty = specialty;
	}
	
	@Override
	public void describe() {
		System.out.println("Doctor - name: " + this.name + ", specialty: " + this.specialty);		
	}

}