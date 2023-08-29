package proxy.classes;

public class Hospitalization implements IHospitalization {
	private Person person;
	private int days;
	
	public Hospitalization(Person person, int days) {
		this.person = person;
		this.days = days;
	}
	
	public Person getPerson() {
		return this.person;
	}
	
	@Override
	public void admit() {
		System.out.println(this.person.getName() + " has been hospitalized for "+ this.days + " days - she/he has insurance: " + this.person.getHasMedicalInsurance());
	}
}