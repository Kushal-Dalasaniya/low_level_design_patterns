package structural_design_patterns.bridge_pattern;

public interface Device {
	void turnOn();
	void turnOff();
	void setChannel(int number);
}
