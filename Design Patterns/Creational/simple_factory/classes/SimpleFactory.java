package simple_factory.classes;

public class SimpleFactory {
	
	public IHospitalStaff createObject(HospitalStaffType type, String name) {
		switch(type) {
			case PHARMACIST:
				return new Pharmacist(name);
			default:
				return null;
		}
	}
	
	public IHospitalStaff createObject(HospitalStaffType type, String name, String branch) {
		switch(type) {
			case DOCTOR:
				return new Doctor(name, branch);
			case NURSE:
				return new Nurse(name, branch);
			default:
				return null;
		}
	}
}