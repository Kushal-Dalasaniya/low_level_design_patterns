package behavioural_design_patterns.state_pattern;

public class Canvas {
	private Tool currentTool;
	
	public void mouseDown() {
		currentTool.mouseDown();
	}
	
	public void mouseUp() {
		currentTool.mouseUp();
	}
	
	public Tool getCurrentTool() {
		return currentTool;
	}
	
	public void setTool(Tool selectedTool) {
		this.currentTool=selectedTool;
	}
}
