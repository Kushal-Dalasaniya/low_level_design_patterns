package structural_design_patterns.flyweight_pattern;

public class Point {
    private int x;
    private int y;
    private PointIcon icon;
    
    public Point(int x, int y,PointIcon icon) {
        this.x = x;
        this.y = y;
        this.icon=icon;
    }

    public void drow(){
        System.out.printf("%s at (%d,%d)",icon.getType(),x,y);
        System.out.println();
    }
}
