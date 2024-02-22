package structural_design_patterns.facade_patterns;

public class Main {

	public static void main(String[] args) {
		NotificationService service = new NotificationService();
		service.send("Hellow", "target");
	}

}