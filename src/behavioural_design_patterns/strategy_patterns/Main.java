package behavioural_design_patterns.strategy_patterns;

public class Main {
	public static void main(String[] args) {
		ImageStorage storage = new ImageStorage();
		
		storage.store("kal",new JpegCompressor(),new BlackAndWhileFilter());
		
		storage.store("windo.img",new PngCompressor(),new BlackAndWhileFilter());
	}
}
