package creational_design_patterns.abstractFactory;

import creational_design_patterns.abstractFactory.App.ContactForm;
import creational_design_patterns.abstractFactory.ant.AntWidgetFactory;
import creational_design_patterns.abstractFactory.material.MaterialWidgetFactory;

public class Main {
    public static void main(String[] args) {
        new ContactForm().render(new AntWidgetFactory());
    }    
}
