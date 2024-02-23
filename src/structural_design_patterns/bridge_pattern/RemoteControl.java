package structural_design_patterns.bridge_pattern;

public class RemoteControl {
	protected Device device;
	
	public RemoteControl(Device device) {
		super();
		this.device = device;
	}
	
	public void turnOn() {
		device.turnOn();
	}
	
	public void turnOff() {
		device.turnOff();
	}
}
