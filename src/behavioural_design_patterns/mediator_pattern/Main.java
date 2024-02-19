package behavioural_design_patterns.mediator_pattern;

/**
 * In this Pattern's code we Implement code using mediator and Observer both patterns to get batter understanding.
 */
public class Main {
	public static void main(String[] args) {
		var dialog = new ArticlesDialogBox();
		dialog.simulateUserIntrection();
	}
}
