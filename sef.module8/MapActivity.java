import java.util.HashMap;
import java.util.Map;

public class MapActivity {

    public static void main(String[] args) {
        Map<String, String> namesById = new HashMap<>();

        namesById.put("001", "Peter Parker");
        namesById.put("002", "Green Goblin");
        namesById.put("003", "Super Man");

        MapActivity activity = new MapActivity();
        activity.print(namesById);
    }

    void print(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}