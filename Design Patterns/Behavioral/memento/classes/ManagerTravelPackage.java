package memento.classes;

import java.util.ArrayList;
import java.util.List;

public class ManagerTravelPackage {
	private List<MementoTravelPackage> travelPackages = new ArrayList<MementoTravelPackage>();
	
	public void addMemento(MementoTravelPackage memento) {
		travelPackages.add(memento);
	}
	
	public MementoTravelPackage getMemento(int index) {
		return travelPackages.get(index);
	}
	
	public MementoTravelPackage getLastMemento() throws Exception {
		if(travelPackages.size() != 0) {
			MementoTravelPackage mementoTravelPackage = travelPackages.get(travelPackages.size() - 1);
			travelPackages.remove(travelPackages.size() - 1);
			return mementoTravelPackage;
		} else {
			throw new Exception("There are no saved states!");
		}
	}
}