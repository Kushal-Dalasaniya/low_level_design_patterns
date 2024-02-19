package structural_design_patterns.decorator_pattern;

public class EncryptedCloudStream implements Stream {
    private Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data){
        String encrypted = encrypt(data);
        stream.write(encrypted);
    }
 
    private String encrypt(String data){
    	System.out.println("Encrypting "+data);
        return "!@#$(!@#*()*)(*!@#)";
    }
}
