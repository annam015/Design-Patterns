package state.classes;

public class Table {
	private int number;
	private IState state;
	
	public Table(int number) {
		this.number = number;
		this.state = new FreeState();
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public IState getState() {
		return this.state;
	}
	
	public void setState(IState state) {
		this.state = state;
	}
	
	public void occupyTable() {
		OccupiedState occupiedState = new OccupiedState();
		occupiedState.changeState(this);
	}
	
	public void reserveTable() {
		ReservedState reservedState = new ReservedState();
		reservedState.changeState(this);
	}
	
	public void freeTable() {
		FreeState freeState = new FreeState();
		freeState.changeState(this);
	}
}