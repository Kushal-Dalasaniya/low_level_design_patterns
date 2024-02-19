package behavioural_design_patterns.memento_pattern;

public class MementoPattern {
	public static void main(String[] args) {
		var editor = new Editor();
		
		editor.write("kushal");
		editor.save();
		
		editor.write("kal");
		editor.save();
		
		editor.write("hello world");
		editor.save();
		
		System.out.println(editor.getContent());
		editor.restore();
		
		System.out.println(editor.getContent());
		editor.save();
		
		System.out.println(editor.getContent());
		editor.restore();
		
		editor.restore();
		
		System.out.println(editor.getContent());
		editor.save();
		
		editor.restore();
		System.out.println(editor.getContent());
		
		editor.restore();
		System.out.println(editor.getContent());
		System.out.println(editor.toString());
	}
}
