import java.util.Map;

public class MapOne {

    public Map<String, String> mapShare(Map<String, String> map) {
        map.remove("c");
        if (map.containsKey("a")) {
            if (map.get("a") == null) {
                return map;
            }
            map.put("b", map.get("a"));
            return map;
        }
        return map;
    }

    public static Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            StringBuilder ab = new StringBuilder();
            ab.append(map.get("a")).append(map.get("b"));
            map.put("ab", String.valueOf(ab));
            return map;
        }
        return map;
    }

    public Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.containsKey("spinach")) {
            map.put("spinach", "salt");
        }
        return map;
    }

}
