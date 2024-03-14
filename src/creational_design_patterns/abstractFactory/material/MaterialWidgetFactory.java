package creational_design_patterns.abstractFactory.material;

import creational_design_patterns.abstractFactory.Button;
import creational_design_patterns.abstractFactory.TextBox;
import creational_design_patterns.abstractFactory.App.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory{
    @Override
    public TextBox createTextBox() {
        return new MaterialTextBox();
    }

    @Override
    public Button createButton() {
        return new MaterialButton();
    }
}
