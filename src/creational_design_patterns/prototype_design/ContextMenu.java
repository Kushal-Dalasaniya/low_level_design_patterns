package creational_design_patterns.prototype_design;

public class ContextMenu {
    public Component duplicate(Component component){
       return component.clone();
    }    
}
