package proxy.main;

import proxy.classes.*;

public class ProxyMain {

	public static void main(String[] args) {
		// without proxy
		Person person1 = new Person("Leyla", false);
		Hospitalization hospitalization1 = new Hospitalization(person1, 3);
		hospitalization1.admit();
		
		Person person2 = new Person("Johnny", true);
		Hospitalization hospitalization2 = new Hospitalization(person2, 5);
		hospitalization2.admit();
		
		System.out.println();
		
		// with proxy
		IHospitalization hospitalizationProxy1 = new ProxyHospitalization(hospitalization1);
		hospitalizationProxy1.admit();
		
		IHospitalization hospitalizationProxy2 = new ProxyHospitalization(hospitalization2);
		hospitalizationProxy2.admit();
	}

}