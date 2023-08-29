package state.classes;

public class ReservedState implements IState {

	@Override
	public void changeState(Table table) {
		if(table.getState() instanceof ReservedState) {
			System.out.println("Table number " + table.getNumber() + " is already reserved!");
		} else if(table.getState() instanceof OccupiedState) {
			System.out.println("Table number " + table.getNumber() + " cannot be reserved because it is occupied!");
		}
		else {
			table.setState(this);
			System.out.println("Table number " + table.getNumber() + " is now in the Reserved state.");
		}
	}

}