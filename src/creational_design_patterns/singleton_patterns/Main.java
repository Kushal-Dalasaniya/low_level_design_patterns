package creational_design_patterns.singleton_patterns;

public class Main {
    public static void main(String[] args) {
        ConfigManager manager = ConfigManager.getInstant();
        manager.set("name","mosh");

        ConfigManager other = ConfigManager.getInstant();
        other.get("name");

        System.err.println(other.get("name"));
    }
}
