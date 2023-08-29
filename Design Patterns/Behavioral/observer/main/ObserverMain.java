package observer.main;

import observer.classes.Hospital;
import observer.classes.Patient;

public class ObserverMain {
	
	public static void main(String[] args) {
		Patient patient1 = new Patient("John");
		Patient patient2 = new Patient("Sarah");
		Patient patient3 = new Patient("Jann");
		
		Hospital hospital1 = new Hospital("MedLife");
		
		hospital1.addObserver(patient1);
		hospital1.addObserver(patient2);
		hospital1.addObserver(patient3);
		
		hospital1.notifyObserver("We have identified a new virus variant, ViroX-21. Stay vigilant and follow safety guidelines.");

		hospital1.deleteObserver(patient2);
		hospital1.notifyObserver("Delta variant detected. Get vaccinated and practice safety measures to protect yourself and others.");
	}
	
}