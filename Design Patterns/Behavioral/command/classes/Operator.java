package command.classes;

import java.util.ArrayList;
import java.util.List;

public class Operator {
	private List<ICommand> commands;
	
	public Operator() {
		commands = new ArrayList<ICommand>();
	}

	public void addCommand(ICommand command) {
		commands.add(command);		
	}

	public void undo() {
		if(!commands.isEmpty()) {
			commands.remove(commands.size() - 1);
		}
	}

	public void executeCommand() {
		if(!commands.isEmpty()) {
			commands.get(0).execute();
			commands.remove(0);
		} else {
			System.out.println("There is no command!");
		}
	}
}