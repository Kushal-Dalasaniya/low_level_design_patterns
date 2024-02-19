package behavioural_design_patterns.chain_of_responsibility;

public class Logger extends Handler{
	public Logger(Handler next) {
		super(next);
	}

	public void log(HttpRequest request) {
		System.out.println("Log");
	}

	@Override
	public boolean doHandle(HttpRequest request) {
		System.out.println("Log");
		return false;
	}
}
