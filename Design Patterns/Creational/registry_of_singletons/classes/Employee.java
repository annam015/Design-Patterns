package registry_of_singletons.classes;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Employee {
	
	private String name;
	private int yearOfEmployment;
	private static Map<String, Employee> employeeRegistry = new HashMap<>();

	private Employee(String name, int yearOfEmployment) {
		this.name = name;
		this.yearOfEmployment = yearOfEmployment;
	}
	
	public void setYearOfEmployment(int yearOfEmployment) {
		if(yearOfEmployment <= LocalDate.now().getYear()) {
			this.yearOfEmployment = yearOfEmployment;
		}
	}
	
	public static Employee getEmployee(String name) {
		if (employeeRegistry.containsKey(name)) {
			return employeeRegistry.get(name);
		} else {
			Employee employee = new Employee(name, LocalDate.now().getYear());
			employeeRegistry.put(employee.name, employee);
			return employee;
		}
	}

	@Override
	public String toString() {
		return ("Name: " + name + ", year of employment: " + yearOfEmployment);
	}
	
}