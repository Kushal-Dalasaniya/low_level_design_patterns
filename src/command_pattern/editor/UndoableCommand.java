package command_pattern.editor;

public interface UndoableCommand extends Command{
	void unexecute();
}
