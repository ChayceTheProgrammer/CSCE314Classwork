package CollectionsInJava;

import java.util.ArrayList;
import java.util.Iterator;

public class EditCollectionWithIterator {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding some numbers to the ArrayList
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        // Display the original ArrayList
        System.out.println("Original ArrayList: " + numbers);

        // Create an Iterator to traverse and edit the ArrayList
        Iterator<Integer> iterator = numbers.iterator();

        // Edit the collection using the Iterator
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 2 == 0) {
                // Remove even numbers from the ArrayList
                iterator.remove();
            }
        }

        // Display the ArrayList after editing
        System.out.println("ArrayList after removing even numbers: " + numbers);
    }
}
