package mediator_pattern;

public class TextBox extends UIControl {
	private String content;
	
	/* Next 3 lines for mediator pattern*/
//	public TextBox(DialogBox owner) {
//		super(owner);
//	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		
		/* Next 1 lines for mediator pattern*/
//		owner.changed(this);
		
		/* Next 1 lines for Observer pattern*/
		notifyEventHandlers();
	}
}
