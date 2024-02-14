package command_pattern.fx;

public class Button {
	private String label;
	private Command command;
	
	public Button(Command command) {
		super();
		this.command = command;
	}
	
	public void click() {
		command.execute();
	}
	
	public String getLabel() {
		return label;
	}
}
