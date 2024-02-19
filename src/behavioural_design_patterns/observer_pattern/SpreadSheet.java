package behavioural_design_patterns.observer_pattern;

public class SpreadSheet implements Observer {
	private DataSource dataSource;
	
	public SpreadSheet(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	@Override
	public void update() {
		System.out.println("SpreadSheet got notified : "+dataSource.getValue());
	}
	
}
