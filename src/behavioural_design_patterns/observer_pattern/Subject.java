package behavioural_design_patterns.observer_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Observable
 */
public class Subject {
	List<Observer> observers;
	
	public Subject() {
		super();
		this.observers = new ArrayList<Observer>();
	}

	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObserver() {
		for(Observer ob : observers) 
			ob.update();
	}
}
