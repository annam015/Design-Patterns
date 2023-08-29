package registry_of_singletons.main;

import registry_of_singletons.classes.Employee;

public class RegistryMain {

	public static void main(String[] args) {
		
		Employee employee1 = Employee.getEmployee("John Doe");
		Employee employee2 = Employee.getEmployee("Alexandra Parker");
		Employee employee3 = Employee.getEmployee("John Doe");
		
		employee1.setYearOfEmployment(2018);
		employee2.setYearOfEmployment(2019);
		employee3.setYearOfEmployment(2020);
		
		System.out.println(employee1.toString());
		System.out.println(employee2.toString());
		System.out.println(employee3.toString());
	}

}