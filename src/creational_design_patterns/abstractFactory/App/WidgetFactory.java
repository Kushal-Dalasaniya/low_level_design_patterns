package creational_design_patterns.abstractFactory.App;

import creational_design_patterns.abstractFactory.Button;
import creational_design_patterns.abstractFactory.TextBox;

public interface WidgetFactory {
    TextBox createTextBox();
    Button createButton();
}
