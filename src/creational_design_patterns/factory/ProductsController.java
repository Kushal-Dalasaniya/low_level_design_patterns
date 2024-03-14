package creational_design_patterns.factory;

import java.util.HashMap;
import java.util.Map;

import creational_design_patterns.factory.Sharp.SharpController;
import creational_design_patterns.factory.matcha.Controller;

public class ProductsController extends SharpController{
    public void listProducts(){
        Map<String,Object> context  = new HashMap<>();
        render("products.html", context);
    }
}
