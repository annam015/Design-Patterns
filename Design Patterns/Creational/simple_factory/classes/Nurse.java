package simple_factory.classes;

public class Nurse implements IHospitalStaff {

	private String name;
	private String field;
	
	protected Nurse(String name, String field) {
		this.name = name;
		this.field = field;
	}
	
	@Override
	public void describe() {
		System.out.println("Nurse - name: " + this.name + ", field: " + this.field);		
	}

}