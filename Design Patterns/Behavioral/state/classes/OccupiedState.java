package state.classes;

public class OccupiedState implements IState {

	@Override
	public void changeState(Table table) {
		if(table.getState() instanceof OccupiedState) {
			System.out.println("Table number " + table.getNumber() + " is already occupied!");
		}
		else {
			table.setState(this);
			System.out.println("Table number " + table.getNumber() + " is now in the Occupied state.");
		}
	}

}