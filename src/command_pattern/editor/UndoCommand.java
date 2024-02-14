package command_pattern.editor;

public class UndoCommand implements Command {
	private History history;
	
	public UndoCommand(History history) {
		super();
		this.history = history;
	}

	@Override
	public void execute() {
		if(history.size()==0) 
			return;
		history.pop().unexecute();
	}

}
