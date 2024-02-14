package strategy_patterns;

public class PngCompressor implements Compressor{
	@Override
	public void comressImage() {
		System.out.println("Compressing using PNG");
	}
}
