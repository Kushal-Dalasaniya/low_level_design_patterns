package structural_design_patterns.bridge_pattern;

public class SonyTV implements Device {

	@Override
	public void turnOn() {
		System.out.println("Sony: turn On");

	}

	@Override
	public void turnOff() {
		System.out.println("Sony: turn Off");

	}

	@Override
	public void setChannel(int number) {
		System.out.println("Sony: set Channel");
	}

}
