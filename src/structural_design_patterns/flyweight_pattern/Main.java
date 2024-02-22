package structural_design_patterns.flyweight_pattern;
/**
 * Using flyweight pattern we can reduce amount of memory 
 */
public class Main {
    public static void main(String[] args) {
        
        PointService service = new PointService(new PointIconFactory());
        
        for (Point point : service.getPoints()) 
            point.drow();

    }
}
