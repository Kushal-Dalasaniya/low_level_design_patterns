package behavioural_design_patterns.mediator_pattern;

public class ListBox extends UIControl {
	private String selection;
	
	/* Next 3 lines for mediator pattern*/
//	public ListBox(DialogBox owner) {
//		super(owner);
//	}

	public String getSelection() {
		return selection;
	}

	public void setSelection(String selection) {
		this.selection = selection;
		
		/* Next 1 lines for mediator pattern*/
//		owner.changed(this);
		
		/* Next 1 lines for Observer pattern*/
		notifyEventHandlers();
	}
}
