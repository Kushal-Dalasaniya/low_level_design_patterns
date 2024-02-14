package command_pattern;

import command_pattern.editor.BoldCommand;
import command_pattern.editor.History;
import command_pattern.editor.HtmlDocument;
import command_pattern.fx.Button;

public class Main {

	public static void main(String[] args) {
		var service = new CustomerService();
		var command =  new AddCustomerCommand(service);
		var button = new Button(command);
		
		button.click();
		
		/* composite command */
		var composite = new CompositeCommand();
		composite.add(new ResizeCommand());
		composite.add(new BlackAndWhiteCommand());
		composite.execute();
		
		/* Undo Mechanism */
		var history = new History();
		var document = new HtmlDocument();
		document.setContent("hello world");
		
		var boldCommand = new BoldCommand(document, history);
		boldCommand.execute();
		System.out.println(document.getContent());
		
		boldCommand.unexecute();
		System.out.println(document.getContent());
	}

}
