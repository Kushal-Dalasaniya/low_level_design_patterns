package structural_design_patterns.facade_patterns;

public class NotificationService {
	public void send(String message,String target) {
		NotificationServer server = new NotificationServer();
		Connection connection = server.connect("ip");
		AuthToken authenticate = server.authenticate("appId", "key");
		Message mes = new Message(message);
		server.send(authenticate,mes,target);
		connection.disconnect();
	}
}
