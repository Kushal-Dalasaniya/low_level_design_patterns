package command_pattern;

import command_pattern.fx.Command;

public class ResizeCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Resize window");
	}

}
