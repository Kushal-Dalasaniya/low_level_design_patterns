package behavioural_design_patterns.command_pattern;

import java.util.ArrayList;
import java.util.List;

import behavioural_design_patterns.command_pattern.fx.Command;

public class CompositeCommand implements Command {
	private List<Command> commands = new ArrayList<>();
	
	public void add(Command command) {
		commands.add(command);
	}
	
	@Override
	public void execute() {
		for(var command : commands) {
			command.execute();
		}
	}

}
