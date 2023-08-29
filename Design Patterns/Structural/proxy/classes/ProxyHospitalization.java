package proxy.classes;

public class ProxyHospitalization implements IHospitalization {
	private Hospitalization hospitalization;
	
	public ProxyHospitalization(Hospitalization hospitalization) {
		this.hospitalization = hospitalization;
	}
	
	public ProxyHospitalization(Person person, int days) {
		this.hospitalization = new Hospitalization(person, days);
	}

	@Override
	public void admit() {
		if(hospitalization.getPerson().getHasMedicalInsurance() == true) {
			hospitalization.admit();
		}
		else {
			System.out.println(this.hospitalization.getPerson().getName() + " can't be hospitalized because she/he does not have medical insurance.");
		}
	}
}