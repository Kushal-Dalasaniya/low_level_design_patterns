package behavioural_design_patterns.visitor_pattern;

public class Main {

	public static void main(String[] args) {
		HtmlDocument document = new HtmlDocument();
		document.add(new HeadingNode());
		document.add(new AnchorNode());
		
//		document.execute(new HighlightOperation());
		
		document.execute(new PlainTextOperation());
	}

}
