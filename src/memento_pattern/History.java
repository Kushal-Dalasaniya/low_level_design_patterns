package memento_pattern;

import java.util.ArrayList;
import java.util.List;

public class History {
	Integer ind=0;
	private List<EditorState> states = new ArrayList<>();
	
	public void push(EditorState sta) {
		states.add(sta);
		ind=states.size()-1;
	}
	
	public EditorState pop() {
		EditorState st =  states.get(ind);
		ind--;
		return st;
	}

	@Override
	public String toString() {
		return "History [ind=" + ind + ", states=" + states + "]";
	}
	
}
