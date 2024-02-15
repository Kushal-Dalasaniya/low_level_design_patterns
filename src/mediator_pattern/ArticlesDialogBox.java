package mediator_pattern;

/**
 * In this class we have two implementation one using mediator pattern and anther using Observer pattern
 * 
 * In mediator pattern we need to extends {@link DialogBox} and uncomment objects with this key word and uncomment all commented code
 * and comment Observer pattern code.
 * 
 * In case of Observer pattern we not need any {@link DialogBox} 
 */
public class ArticlesDialogBox extends DialogBox{
	/* Next 3 lines for mediator pattern */
//	private ListBox listBox = new ListBox(this);
//	private TextBox titleTextBox = new TextBox(this);
//	private Button saveButton = new Button(this);
	
	/* Next 3 lines for Observer pattern */
	private ListBox listBox = new ListBox();
	private TextBox titleTextBox = new TextBox();
	private Button saveButton = new Button();
	
	
	public ArticlesDialogBox() {

		/** 
		 * hear we need to pass EventHandler implemented class. so we created instantly using ->(lambda) 
		 * is interface having only one method than we can create instant implemented class like below
		 */
		/* listBox.addEventHandler(()-> articalSelected()); */
		
		/* we can write like this also */
		/* listBox.addEventHandler(new EventHandler() {
			@Override
			public void handle() {
				articalSelected();
			}
		});*/
		
		/* And like this also we can directly pass reference to that method */
		listBox.addEventHandler(this::articalSelected);
		titleTextBox.addEventHandler(this::titleChanged);
		
	}
	
	public void simulateUserIntrection() {
		listBox.setSelection("Artical 1 ");
//		titleTextBox.setContent(null);
//		titleTextBox.setContent("");
		System.out.println("TextBox : " + titleTextBox.getContent());
		System.out.println("Button: " + saveButton.isEnabled());
	}

	/* This method we need to in mediator pattern*/
	@Override
	public void changed(UIControl control) {
		if(control==listBox) 
			articalSelected();
		else if(control==titleTextBox)
			titleChanged();
	}
	
	private void articalSelected() {
		titleTextBox.setContent(listBox.getSelection());
		saveButton.setEnabled(true);
	}
	private void titleChanged() {
		var content = titleTextBox.getContent();
		var isEmpty = content==null || content.isEmpty();
		saveButton.setEnabled(!isEmpty);
	}
}
