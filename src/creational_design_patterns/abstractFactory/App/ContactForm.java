package creational_design_patterns.abstractFactory.App;

public class ContactForm {
    public void render (WidgetFactory widgetFactory){
        widgetFactory.createButton().render();
        widgetFactory.createTextBox().render();
    }
}
