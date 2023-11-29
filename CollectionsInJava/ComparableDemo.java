package CollectionsInJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<ComparableObject> people = new ArrayList<>();
        people.add(new ComparableObject("Alice", 25));
        people.add(new ComparableObject("Bob", 30));
        people.add(new ComparableObject("Charlie", 28));

        System.out.println("Before sorting:");
        for (ComparableObject person : people) {
            System.out.println(person);
        }

        Collections.sort(people);

        System.out.println("\nAfter sorting by age:");
        for (ComparableObject person : people) {
            System.out.println(person);
        }

        System.out.println("\nBefore sorting by name:");
        for (ComparableObject person : people) {
            System.out.println(person);
        }

        Collections.sort(people, (a, b) -> a.compareByName(b));

        System.out.println("\nAfter sorting by name:");
        for (ComparableObject person : people) {
            System.out.println(person);
        }
    }
}