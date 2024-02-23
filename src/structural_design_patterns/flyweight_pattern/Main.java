package structural_design_patterns.flyweight_pattern;

/**
 * The flyweight pattern is applicable in scenarios where we aim to optimize memory usage by reusing shared objects. 
 * In the given example, we have a Point object with two fields: PointType and icon. Different icons are associated with 
 * different PointType values, such as HOSPITAL, CAFE, and RESTAURANT. Instead of embedding the icon information within 
 * each Point object, we extract this information into a separate PointIcon object and manage it through a PointIconFactory.
 * <P>
 * Using the flyweight pattern, we ensure that only one instance of each PointIcon object is created for each unique 
 * PointType. When a Point object is created, it retrieves the corresponding PointIcon object from the PointIconFactory. 
 * If the desired PointIcon object already exists, the factory returns it; otherwise, it creates a new one.
 * <P>
 * By employing this approach, memory consumption is minimized as multiple Point objects can share the same PointIcon 
 * object for a given PointType. This efficient sharing mechanism optimizes memory usage, particularly in scenarios 
 * with a large number of Point objects with similar characteristics.
 * <P>
 * Therefore, the flyweight pattern is beneficial when dealing with objects that have intrinsic and extrinsic states, 
 * allowing us to reduce memory overhead by reusing shared state information.
 */
public class Main {
    public static void main(String[] args) {
        
        PointService service = new PointService(new PointIconFactory());
        
        for (Point point : service.getPoints()) 
            point.drow();

    }
}
