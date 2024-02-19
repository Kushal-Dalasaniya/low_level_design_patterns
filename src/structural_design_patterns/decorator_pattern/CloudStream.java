package structural_design_patterns.decorator_pattern;

public class CloudStream implements Stream{
    @Override
    public void write(String data){
        System.out.println("Storing "+data);
    }
}
