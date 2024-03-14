package creational_design_patterns.abstractFactory.ant;

import creational_design_patterns.abstractFactory.Button;
import creational_design_patterns.abstractFactory.TextBox;
import creational_design_patterns.abstractFactory.App.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory{
    @Override
    public TextBox createTextBox() {
        return new AntTextBox();
    }

    @Override
    public Button createButton() {
        return new AntButton();
    }
}
