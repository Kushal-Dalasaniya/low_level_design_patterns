package structural_design_patterns.decorator_pattern;

public class CompressedCloudStream implements Stream{
    private Stream stream;
    
    public CompressedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data){
        String compressData = compress(data);
        stream.write(compressData);
    }

    private String compress(String data){
    	System.out.println("Compressing "+data);
        return data.substring(0,5);
    }
}
