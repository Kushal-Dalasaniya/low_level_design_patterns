package behavioural_design_patterns.command_pattern.editor;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
	private Deque<UndoableCommand> commands = new ArrayDeque<>();
	
	void push(UndoableCommand command) {
		commands.add(command);
	}
	
	UndoableCommand pop() {
		return commands.pop();
	}
	
	int size() {
		return commands.size();
	}
}
