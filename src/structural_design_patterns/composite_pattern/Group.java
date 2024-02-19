package structural_design_patterns.composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component{
    /* Before Composite pattern */
    /*
    private List<Object> objects = new ArrayList<>();
    
    public void add(Object shape){
        objects.add(shape);
    }

    @Override
    public void render(){
        for (Object object : objects) {
            if(object instanceof Shape){
                ((Shape)object).render();
            }
            else{
                ((Group)object).render();
            }
        }
    }
    */
    
    /********************************************************************************************************/
    private List<Component> components = new ArrayList<>();

    public void add(Component shape){
        components.add(shape);
    }
    
    @Override
    public void render(){
        for (Component component : components) {
            component.render();
        }
    }

    @Override
    public void move() {
        for (Component component : components) {
            component.move();
        }
    }
}
