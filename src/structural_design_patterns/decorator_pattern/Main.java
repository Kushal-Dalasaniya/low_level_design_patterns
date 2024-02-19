package structural_design_patterns.decorator_pattern;
/**
 * The decorator pattern is utilized here to enhance the functionality of objects without modifying their code directly.
 * In the provided example, we already have two features or behaviors represented by CloudStream, CompressedCloudStream,
 * and EncryptedCloudStream. Now, if we need to add another behavior without altering the existing code,
 * the decorator pattern becomes invaluable.<br><br>
 * 
 * By implementing decorators such as CompressedCloudStream and EncryptedCloudStream, we can dynamically add additional
 * functionalities to the base CloudStream object at runtime. This allows for a flexible and modular approach
 * to extending the behavior of objects without the need for modifying their underlying implementation.<br><br>
 * 
 * Therefore, the decorator pattern empowers us to incorporate new features seamlessly and maintain the open/closed
 * principle, ensuring that our code remains easily extensible and resilient to changes.<br><br>
 */

public class Main {
    public static void main(String[] args) {
        /* Here we can use both Compression and Encryption without do any code changes */
        storeCreditCard(new CompressedCloudStream(new EncryptedCloudStream(new CloudStream())));
    }

    public static void storeCreditCard(Stream stream){
        stream.write("1234-1234-1234-1234");
    }
}
