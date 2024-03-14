package creational_design_patterns.factory.Sharp;

import creational_design_patterns.factory.matcha.Controller;
import creational_design_patterns.factory.matcha.ViewEngine;

public class SharpController extends Controller{
    @Override
    protected ViewEngine CreateViewEngine(){
        return new SharpViewEngine();
    }
}
