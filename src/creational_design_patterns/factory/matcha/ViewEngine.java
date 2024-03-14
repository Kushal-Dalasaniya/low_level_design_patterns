package creational_design_patterns.factory.matcha;

import java.util.Map;

public interface ViewEngine {
    String render(String viewName,Map<String,Object> context);
}
