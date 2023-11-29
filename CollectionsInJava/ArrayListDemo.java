package CollectionsInJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();

        // Adding elements to the ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // Display the ArrayList
        System.out.println("ArrayList: " + names);

        // Access an element by index
        String firstPerson = names.get(0);
        System.out.println("First person: " + firstPerson);

        // Update an element
        names.set(2, "Eve");
        System.out.println("Updated ArrayList: " + names);

        // Check if an element exists
        boolean containsBob = names.contains("Bob");
        System.out.println("Contains Bob: " + containsBob);

        // Find the index of an element
        int index = names.indexOf("Charlie");
        System.out.println("Index of Charlie: " + index);
        //should be -1 because "Eve" replaced him earlier in the code

        // Remove an element by value
        names.remove("David");
        System.out.println("ArrayList after removing David: " + names);

        // Iterating through the ArrayList using an iterator
        System.out.print("Iterating through the ArrayList using an iterator: ");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Sorting the ArrayList
        Collections.sort(names);
        System.out.println("Sorted ArrayList: " + names);
    }
}
