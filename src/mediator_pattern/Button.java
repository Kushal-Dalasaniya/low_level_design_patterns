package mediator_pattern;

public class Button extends UIControl{
	private boolean isEnabled;
	
	/* Next 3 lines for mediator pattern*/
//	public Button(DialogBox owner) {
//		super(owner);
//	}
	
	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
		
		/* Next 1 lines for mediator pattern*/
//		owner.changed(this);
		
		/* Next 1 lines for Observer pattern*/
		notifyEventHandlers();
	}
}
