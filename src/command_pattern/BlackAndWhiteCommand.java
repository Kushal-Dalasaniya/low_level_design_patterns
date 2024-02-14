package command_pattern;

import command_pattern.fx.Command;

public class BlackAndWhiteCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Black and white command");
	}
}
