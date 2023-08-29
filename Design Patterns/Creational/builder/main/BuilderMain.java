package builder.main;

import builder.classes.*;

public class BuilderMain {

	public static void main(String[] args) {
		
		IBuilder patientBuilder = new PatientBuilder("NA");
		
		IPatient patient1 = patientBuilder.setHasFoldingBed(true).setHasBreakfast(true).build();
		IPatient patient2 = patientBuilder.build();
		IPatient patient3 = patientBuilder.setHasRobe(true).setHasSlippers(true).build();
		IPatient patient4 = patientBuilder.build();
		IPatient patient5 = patientBuilder.setHasFoldingBed(false).build();

		patient1.setName("Alex");
		patient2.setName("Martha");
		patient3.setName("Juan");
		patient4.setName("Anne");
		patient5.setName("Raul");
		
		patient1.describe();
		patient2.describe();
		patient3.describe();
		patient4.describe();
		patient5.describe();
		
	}

}