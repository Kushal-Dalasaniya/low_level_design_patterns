package behavioural_design_patterns.command_pattern.editor;

public class BoldCommand implements UndoableCommand {
	private String prevContent;
	private HtmlDocument document;
	private History history;
	
	public BoldCommand(HtmlDocument document, History history) {
		super();
		this.document = document;
		this.history = history;
	}

	@Override
	public void execute() {
		prevContent = document.getContent();
		document.makeBold();
		history.push(this);
	}

	@Override
	public void unexecute() {
		document.setContent(prevContent);
	}

}
