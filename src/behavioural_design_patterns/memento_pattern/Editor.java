package behavioural_design_patterns.memento_pattern;

public class Editor {
	private String content;
	private History history;
	
	public Editor() {
		this.history=new History();
	}
	
	public void restore() {
		history.pop();
		content = history.pop().getContent();
	}
	
	public String getContent() {
		return content;
	}
	
	public void write(String st) {
		content  = st;
	}
	
	public void save() {
		history.push(new EditorState(content));
	}

	@Override
	public String toString() {
		return "Editor [content=" + content + ", history=" + history + "]";
	}
}
