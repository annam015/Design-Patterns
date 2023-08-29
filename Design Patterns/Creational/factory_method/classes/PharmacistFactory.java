package factory_method.classes;

public class PharmacistFactory implements IFactory{

	@Override
	public IHospitalStaff createObject(String name) {
		return new Pharmacist(name);
	}

}