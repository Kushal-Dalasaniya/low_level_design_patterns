package behavioural_design_patterns.observer_pattern;

public class DataSource extends Subject{
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
		notifyObserver();
	}
}
