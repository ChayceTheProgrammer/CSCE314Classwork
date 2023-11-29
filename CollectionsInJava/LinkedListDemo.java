package CollectionsInJava;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Create a LinkedList of strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Alice");
        linkedList.add("Bob");
        linkedList.add("Charlie");

        // Display the LinkedList
        System.out.println("LinkedList: " + linkedList);

        // Adding elements to the beginning of the LinkedList
        linkedList.addFirst("Eve");
        System.out.println("After adding Eve at the beginning: " + linkedList);

        // Adding elements to the end of the LinkedList
        linkedList.addLast("David");
        System.out.println("After adding David at the end: " + linkedList);

        // Accessing elements by index
        String firstPerson = linkedList.get(0);
        String lastPerson = linkedList.getLast();
        System.out.println("First person: " + firstPerson);
        System.out.println("Last person: " + lastPerson);

        // Removing elements by index
        linkedList.remove(2);
        System.out.println("After removing the person at index 2: " + linkedList);

        // Iterating through the LinkedList
        System.out.print("Iterating through the LinkedList: ");
        for (String person : linkedList) {
            System.out.print(person + " ");
        }
        System.out.println();
    }
}
