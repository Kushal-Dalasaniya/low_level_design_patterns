package memento_pattern;

public class EditorState {
	private final String content;

	public EditorState(String content) {
		super();
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	@Override
	public String toString() {
		return "EditorState [content=" + content + "]";
	}
	
}
