package chain_of_responsibility;

public abstract class Handler {
	private Handler next;

	public Handler(Handler next) {
		super();
		this.next = next;
	}
	
	public void handle(HttpRequest request) {
		if(doHandle(request)) return;
		
		if(next!=null)
			next.handle(request);
	}
	
	public abstract boolean doHandle(HttpRequest request);
}
