package memento.main;

import memento.classes.*;

public class MementoMain {

	public static void main(String[] args) {
		ManagerTravelPackage managerTravelPackageDubai = new ManagerTravelPackage();
		ManagerTravelPackage managerTravelPackageTokyo = new ManagerTravelPackage();
		
		TravelPackage travelPackageDubai = new TravelPackage("Dubai", 4500);
		System.out.println(travelPackageDubai.toString());
		managerTravelPackageDubai.addMemento(travelPackageDubai.saveMemento());
		
		TravelPackage travelPackageTokyo = new TravelPackage("Tokyo", 6800);
		System.out.println(travelPackageTokyo.toString());
		managerTravelPackageTokyo.addMemento(travelPackageTokyo.saveMemento());
		
		travelPackageDubai.setPrice(5200);
		System.out.println(travelPackageDubai.toString());
		
		travelPackageDubai.setPrice(4800);
		System.out.println(travelPackageDubai.toString());
		managerTravelPackageDubai.addMemento(travelPackageDubai.saveMemento());
		
		travelPackageTokyo.setPrice(7200);
		System.out.println(travelPackageTokyo.toString());
		
		travelPackageTokyo.setPrice(6500);
		System.out.println(travelPackageTokyo.toString());
		managerTravelPackageTokyo.addMemento(travelPackageTokyo.saveMemento());

		travelPackageDubai.setPrice(5800);
		System.out.println(travelPackageDubai.toString());

		try {
			travelPackageTokyo.undoMemento(managerTravelPackageTokyo.getMemento(0));
			System.out.println(travelPackageTokyo.toString());
		} catch (Exception e) {
			System.out.println("Error!");
		}
		
		try {
			travelPackageDubai.undoMemento(managerTravelPackageDubai.getLastMemento());
			System.out.println(travelPackageDubai.toString());
		} catch (Exception e) {
			System.out.println("Error!");
		}
	}

}