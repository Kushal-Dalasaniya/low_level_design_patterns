package behavioural_design_patterns.template_method_pattern;

public class TransferMoneyTask extends Task {

	public TransferMoneyTask(AuditTrail auditTrail) {
		super(auditTrail);
	}

	@Override
	protected void doExecute() {
		System.out.println("Transfer Money");
	}
}
