package behavioural_design_patterns.strategy_patterns;

public class BlackAndWhileFilter implements Filter {
	@Override
	public void applyFilter() {
		System.out.println("Applying B&W filter");
	}
}
