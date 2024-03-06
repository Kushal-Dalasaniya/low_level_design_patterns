package creational_design_patterns.singleton_patterns;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
    private ConfigManager(){}
    
    private static ConfigManager manager;
    private Map<String,Object> settings = new HashMap<>();

    public static ConfigManager getInstant(){
        if (manager != null) return manager;
        manager = new ConfigManager();
        return manager;
    }

    public Object get(String key){
        return settings.get(key);
    }

    public void set(String key, Object value){
        settings.put(key, value);
    }
}
