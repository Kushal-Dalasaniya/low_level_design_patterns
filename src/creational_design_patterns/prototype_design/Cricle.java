package creational_design_patterns.prototype_design;

public class Cricle implements Component{
    private int radius;
    
    public int getRadius() {
        return radius;
    }
    
    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    @Override
    public void render() {
        System.out.println("Rendering a circle");
    }

    @Override
    public Component clone() {
        Cricle target = new Cricle();
        target.setRadius(this.getRadius());
        return target;
    }
}
