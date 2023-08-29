package singleton.main;

import singleton.classes.SantaClaus;

public class SingletonMain {

	public static void main(String[] args) {	
		
		SantaClaus firstSantaClaus = SantaClaus.getInstance(72);
		firstSantaClaus.getAge();

		SantaClaus secondSantaClaus = SantaClaus.getInstance(85);
		secondSantaClaus.getAge();	
		
	}

}