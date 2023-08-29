package factory_method.classes;

public class NurseFactory implements IFactory{

	@Override
	public IHospitalStaff createObject(String name) {
		return new Nurse(name);
	}

}