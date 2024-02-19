package behavioural_design_patterns.strategy_patterns;

public class HighContrastFilter implements Filter{
	@Override
	public void applyFilter() {
		System.out.println("Applying High Contrast filter");
	}
}
