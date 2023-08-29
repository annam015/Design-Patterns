package state.classes;

public class FreeState implements IState {

	@Override
	public void changeState(Table table) {
		if(table.getState() instanceof FreeState) {
			System.out.println("Table number " + table.getNumber() + " is already free!");
		} else {
			table.setState(this);
			System.out.println("Table number " + table.getNumber() + " is now in the Free state.");
		}		
	}

}