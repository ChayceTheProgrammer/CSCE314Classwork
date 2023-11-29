package CollectionsInJava;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class PeekVsGetFirstDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Alice");
        linkedList.add("Bob");
        linkedList.add("Charlie");

        // Using peek to retrieve the first element without removing it
        String peekedElement = linkedList.peek();
        System.out.println("Peeked element: " + peekedElement);
        System.out.println("LinkedList after peek: " + linkedList);

        try {
            // Using getFirst to retrieve the first element
            String firstElement = linkedList.getFirst();
            System.out.println("First element: " + firstElement);
        } catch (NoSuchElementException e) {
            System.out.println("No element found using getFirst.");
        }

        // Using peek on an empty list
        linkedList.clear();
        String peekedEmpty = linkedList.peek();
        System.out.println("Peeked element from an empty list: " + peekedEmpty);

        try {
            // Using getFirst on an empty list
            String firstEmpty = linkedList.getFirst();
            System.out.println("First element from an empty list: " + firstEmpty);
        } catch (NoSuchElementException e) {
            System.out.println("No element found using getFirst on an empty list.");
        }
    }
}
