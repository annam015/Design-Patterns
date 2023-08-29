package simple_factory.main;

import java.util.ArrayList;
import java.util.List;

import simple_factory.classes.*;

public class SimpleFactoryMain {

	public static void main(String[] args) {
		
		SimpleFactory simpleFactory = new SimpleFactory();
		List<IHospitalStaff> listHospitalStaff = new ArrayList<>();
		
		listHospitalStaff.add(simpleFactory.createObject(HospitalStaffType.DOCTOR, "John", "Cardiology"));
		listHospitalStaff.add(simpleFactory.createObject(HospitalStaffType.PHARMACIST, "Alexandra"));
		listHospitalStaff.add(simpleFactory.createObject(HospitalStaffType.NURSE, "Sara", "Intensive Care Unit"));
		listHospitalStaff.add(simpleFactory.createObject(HospitalStaffType.NURSE, "Mark", "Emergency Department"));
		listHospitalStaff.add(simpleFactory.createObject(HospitalStaffType.DOCTOR, "Martha", "Anesthesiology"));
		
		for(IHospitalStaff hospitalStaff : listHospitalStaff) {
			hospitalStaff.describe();
		}
	}

}