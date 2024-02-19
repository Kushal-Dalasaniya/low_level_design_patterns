package behavioural_design_patterns.strategy_patterns;

public class ImageStorage {
	public void store(String fileName,Compressor compressor,Filter filter) {
		compressor.comressImage();
		filter.applyFilter();
		System.out.println("Store "+fileName+" image");
	}
}
