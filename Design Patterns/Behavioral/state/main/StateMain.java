package state.main;

import state.classes.Table;

public class StateMain {

	public static void main(String[] args) {
		Table table1 = new Table(1);
		
		table1.reserveTable();
		table1.occupyTable();
		table1.reserveTable();
		table1.freeTable();
		table1.reserveTable();
	}

}