package template_method_pattern;

public abstract class Task {
	AuditTrail auditTrail;

	public Task(AuditTrail auditTrail) {
		super();
		this.auditTrail = auditTrail;
	}
	
	/**
	 * This template all need to follow all extended classes
	 * 
	 * before doExecute method the code are same for all methods but after that doExecute method are different in all classes so 
	 * so in all classes must need to implement doExecute method so all classes need to follow same template.
	 */
	public void execute() {
		auditTrail.record();
		doExecute();
	}
	
	protected abstract void doExecute();
}
