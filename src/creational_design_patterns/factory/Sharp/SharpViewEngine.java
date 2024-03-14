package creational_design_patterns.factory.Sharp;

import java.util.Map;

import creational_design_patterns.factory.matcha.ViewEngine;

public class SharpViewEngine implements ViewEngine{

    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "View render by sharp";
    }
    
}
