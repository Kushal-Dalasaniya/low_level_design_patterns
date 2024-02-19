package behavioural_design_patterns.command_pattern.editor;

public interface UndoableCommand extends Command{
	void unexecute();
}
