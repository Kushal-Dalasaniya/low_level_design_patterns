package behavioural_design_patterns.visitor_pattern;

public interface Operation {
	void apply(HeadingNode heading);
	void apply(AnchorNode anchor);
}
