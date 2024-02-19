package behavioural_design_patterns.command_pattern;

import behavioural_design_patterns.command_pattern.fx.Command;

public class AddCustomerCommand implements Command {
	private CustomerService service;
	
	public AddCustomerCommand(CustomerService service) {
		super();
		this.service = service;
	}

	@Override
	public void execute() {
		service.addCustomer();
	}

}
