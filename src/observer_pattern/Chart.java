package observer_pattern;

public class Chart implements Observer{
	private DataSource dataSource;
	
	public Chart(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	@Override
	public void update() {
		System.out.println("Chat got notified : " +  dataSource.getValue());	
	}
	
}
