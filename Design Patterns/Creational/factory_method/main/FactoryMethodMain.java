package factory_method.main;

import java.util.ArrayList;
import java.util.List;

import factory_method.classes.*;

public class FactoryMethodMain {

	public static void main(String[] args) {
		
		IFactory nurseFactory = new NurseFactory();
		IFactory pharmacistFactory = new PharmacistFactory();
		IFactory doctorFactory = new DoctorFactory();
		
		List<IHospitalStaff> listHospitalStaff = new ArrayList<>();
		
		listHospitalStaff.add(pharmacistFactory.createObject("Adrian"));
		listHospitalStaff.add(nurseFactory.createObject("Sara"));
		listHospitalStaff.add(doctorFactory.createObject("Mark"));
		listHospitalStaff.add(doctorFactory.createObject("Alexandra"));
		listHospitalStaff.add(nurseFactory.createObject("Leyla"));
		
		for (IHospitalStaff hospitalStaff : listHospitalStaff) {
			hospitalStaff.describe();
		}
		
	}

}