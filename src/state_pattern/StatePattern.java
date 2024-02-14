 package state_pattern;

public class StatePattern {
	public static void main(String[] args) {
		var canvas = new Canvas();
		
		canvas.setTool(new SelectionTool());
		canvas.mouseDown();
		canvas.mouseUp();
		
		canvas.setTool(new BrushTool());
		canvas.mouseDown();
		canvas.mouseUp();
	}
}
