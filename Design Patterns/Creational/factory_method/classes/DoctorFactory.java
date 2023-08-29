package factory_method.classes;

public class DoctorFactory implements IFactory{

	@Override
	public IHospitalStaff createObject(String name) {
		return new Doctor(name);
	}

}