package CollectionsInJava;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // Creating a HashSet of generic objects
        HashSet<String> names = new HashSet<>();

        // Adding elements to the HashSet
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Iterating through the HashSet
        for (String name : names) {
            System.out.println(name);
        }
    }
}
