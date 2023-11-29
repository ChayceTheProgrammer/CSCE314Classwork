package CollectionsInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {
		// Create a list of strings
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Grapes");

		// Using an iterator to loop through the elements
		System.out.println("Using Iterator to iterate through the list:");
		Iterator<String> iterator = fruits.iterator();
		while (iterator.hasNext()) {
			String fruit = iterator.next();
			System.out.println(fruit);
		}

		System.out.println("\nUsing for-each loop to iterate through the list:");
		// Alternatively, you can use a for-each loop to iterate through the elements
		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		// Remove an element using Iterator
		iterator = fruits.iterator();
		while (iterator.hasNext()) {
			String fruit = iterator.next();
			if (fruit.equals("Banana")) {
				iterator.remove();
			}
		}

		System.out.println("\nAfter removing 'Banana' using Iterator:");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
	}
}
