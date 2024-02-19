package behavioural_design_patterns.observer_pattern;

/**
 * This Implementation example of pull type 
 * Because all Observer should observe all data changes in DataSource. 
 * So when any changes happen in DataSorce it will pull the all changes.
 * 
 * Another type is the push type, in this case, when changes happen in data. dataSourse it self-push changes to the observer.
 * But this push-type implementation is not good because the observer should observe the data by itself. dataSourse should not be sent to observe.
 */
public class Main {
	public static void main(String[] args) {
		DataSource dataSource = new DataSource();
		SpreadSheet spreadSheet1 = new SpreadSheet(dataSource);
		SpreadSheet spreadSheet2 = new SpreadSheet(dataSource);
		Chart chart = new Chart(dataSource);
		
		dataSource.addObserver(chart);
		dataSource.addObserver(spreadSheet2);
		dataSource.addObserver(spreadSheet1);
		
		dataSource.setValue(1);
	}
}
