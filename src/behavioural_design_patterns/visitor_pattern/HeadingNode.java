package behavioural_design_patterns.visitor_pattern;

public class HeadingNode implements HtmlNode {

	@Override
	public void execute(Operation operation) {
		operation.apply(this);
	}

}
