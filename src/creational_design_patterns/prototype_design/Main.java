package creational_design_patterns.prototype_design;

public class Main {
    public static void main(String[] args) {
        Cricle cricle = new Cricle();
        cricle.setRadius(10);

        ContextMenu contextMenu = new ContextMenu();
        Cricle newCir = (Cricle) contextMenu.duplicate(cricle);

        System.out.println(newCir.getRadius());
        newCir.setRadius(15);

        System.out.println(cricle.getRadius());
        System.out.println(newCir.getRadius());
    }
}
