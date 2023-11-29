package CollectionsInJava;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        // Creating a HashMap with generic key-value pairs
        Map<String, Integer> ageMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Charlie", 28);

        // Iterating through the HashMap and printing key-value pairs
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");
        }
    }
}
