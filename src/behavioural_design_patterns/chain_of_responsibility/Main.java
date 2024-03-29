package behavioural_design_patterns.chain_of_responsibility;

public class Main {
	public static void main(String[] args) {
		
		/* 
		 * Our pipeline is like below
		 * authenticator -> authenticator -> compressor
		 */
		Compressor compressor = new Compressor(null);
		Logger logger = new Logger(compressor);
		Authenticator authenticator = new Authenticator(logger);
		
		WebServer server = new WebServer(authenticator);
		server.handle(new HttpRequest("admin", "1234"));
	}
}
