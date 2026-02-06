package collections.map;
import java.util.HashMap;
import java.util.Map;
public class AppConfig {
    public static void main(String[] args) {
        Map<String, String> config = new HashMap<>();
        config.put("DB_HOST", "localhost");
        config.put("DB_PORT", "8080");
        config.put("ENV", "Testing");

        System.out.println("DB Hostname: " +
                config.get("DB_HOST"));
    }
}
