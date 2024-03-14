package creational_design_patterns.abstractFactory.material;

import creational_design_patterns.abstractFactory.Button;

public class MaterialButton implements Button{

    @Override
    public void render() {
        System.out.println("Material Button");
    }
    
}
