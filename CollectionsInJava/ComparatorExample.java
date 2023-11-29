package CollectionsInJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {
	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Alice", 30));
		people.add(new Person("Bob", 25));
		people.add(new Person("Charlie", 35));

		System.out.println("Before sorting:");
		for (Person person : people) {
			System.out.println(person);
		}

		// Sorting the list using the AgeComparator
		Collections.sort(people, new AgeComparator());

		System.out.println("\nAfter sorting based on age:");
		for (Person person : people) {
			System.out.println(person);
		}
	}
}
