package creational_design_patterns.abstractFactory.ant;

import creational_design_patterns.abstractFactory.TextBox;

public class AntTextBox implements TextBox{

    @Override
    public void render() {
       System.out.println("Ant TextBox");
    }
}
