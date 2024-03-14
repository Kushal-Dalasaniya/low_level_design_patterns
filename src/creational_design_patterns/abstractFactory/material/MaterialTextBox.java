package creational_design_patterns.abstractFactory.material;

import creational_design_patterns.abstractFactory.TextBox;

public class MaterialTextBox implements TextBox{

    @Override
    public void render() {
       System.out.println("Material TextBox");
    }
}
