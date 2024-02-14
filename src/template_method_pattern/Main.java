package template_method_pattern;

public class Main {
	public static void main(String[] args) {
		Task tk = new TransferMoneyTask(new AuditTrail());
		tk.execute();
	}
}
