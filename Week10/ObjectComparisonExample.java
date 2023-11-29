package Week10;

public class ObjectComparisonExample {
    public static void main(String[] args) {
        Person2 person1 = new Person2("Alice", 30);
        Person2 person2 = new Person2("Bob", 25);

        // Using the 'equals' method
        System.out.println("Using 'equals' method:");
        System.out.println(person1.equals(person2)); // false

        // Using the 'compareTo' method (Comparable)
        System.out.println("\nUsing 'compareTo' method (Comparable):");
        System.out.println(person1.compareTo(person2)); // 1 (person1 is older)
        
        System.out.println();
    }
}