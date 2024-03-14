package creational_design_patterns.abstractFactory.ant;

import creational_design_patterns.abstractFactory.Button;

public class AntButton implements Button{

    @Override
    public void render() {
        System.out.println("Ant Button");
    }
    
}
