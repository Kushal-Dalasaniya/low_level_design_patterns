package behavioural_design_patterns.strategy_patterns;

public class JpegCompressor implements Compressor {
	@Override
	public void comressImage() {
		System.out.println("Compressing using jpeg");
	}
}
