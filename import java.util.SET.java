import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;

public class SetsAndMaps {

    public static void main(String[] args) {
        // Create a set of integers
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

        // Check if an element is in the set
        System.out.println(set.contains(10)); // true
        System.out.println(set.contains(40)); // false

        // Iterate over the set
        for (Integer i : set) {
            System.out.println(i);
        }

        // Create a map of strings to integers
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);

        // Get the value associated with a key
        System.out.println(map.get("A")); // 10

        // Check if a key is in the map
        System.out.println(map.containsKey("A")); // true
        System.out.println(map.containsKey("D")); // false

        // Iterate over the map
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
