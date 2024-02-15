package chain_of_responsibility;

public class WebServer {
	private Handler handler;
	
	public WebServer(Handler handler) {
		super();
		this.handler = handler;
	}

	public void handle(HttpRequest request) {
		handler.handle(request);
	}
}
