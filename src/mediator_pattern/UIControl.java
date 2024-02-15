package mediator_pattern;

import java.util.ArrayList;
import java.util.List;

public class UIControl {
	
	/* Below implementation is using mediator pattern */
//	protected DialogBox owner;
//
//	public UIControl(DialogBox owner) {
//		super();
//		this.owner = owner;
//	}
	
	/* That same implementation using Observer pattern */
	private List<EventHandler> eventHandlers = new ArrayList<>();
	
	public void addEventHandler(EventHandler observer) {
		eventHandlers.add(observer);
	}
	
	protected void notifyEventHandlers() {
		for(var observer : eventHandlers) 
			observer.handle();
	}
}
