package behavioural_design_patterns.command_pattern;

import behavioural_design_patterns.command_pattern.fx.Command;

public class BlackAndWhiteCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Black and white command");
	}
}
