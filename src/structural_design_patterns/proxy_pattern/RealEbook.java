package structural_design_patterns.proxy_pattern;

public class RealEbook implements Ebook {
	private String fileName;

	public RealEbook(String fileName) {
		super();
		this.fileName = fileName;
		load();
	}
	
	private void load() {
		System.out.println("Loading the ebook " + fileName);
	}
	
	@Override
	public void show() {
		System.out.println("Showing the ebook "+ fileName);
	}
	
	@Override
	public String getFileName() {
		return fileName;
	}
}
