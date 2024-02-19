package behavioural_design_patterns.chain_of_responsibility;

public class HttpRequest {
	private String username;
	private String password;
	
	public HttpRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getUsername() {
		return username;
	}
}
