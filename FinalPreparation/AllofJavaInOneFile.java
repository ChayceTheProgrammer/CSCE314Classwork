// AllofJavaInOneFile.java
package FinalPreparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Defining an interface
interface Displayable {
	void display();
}

// Defining an abstract class
abstract class Animal {
	abstract void makeSound();
}

// Defining a class that extends the abstract class
class Dog extends Animal {
	@Override
	void makeSound() {
		System.out.println("Woof! Woof!");
	}
}

// Defining a class that implements the interface
class DisplayMessage implements Displayable {
	@Override
	public void display() {
		System.out.println("This is a display message.");
	}
}

// Defining a class
public class AllofJavaInOneFile {

	// Entry point of the program
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Printing a message
		System.out.println("Oh So you like Java? Show every feature:");

		// Variables and Data Types
		int num = 42;
		double pi = 3.14;
		char letter = 'A';
		boolean isTrue = true;
		String message = "Hello, Java!";

		// Control Flow - if-else statement
		if (isTrue) {
			System.out.println("The condition is true.");
		} else {
			System.out.println("The condition is false.");
		}

		// Loops - for loop
		for (int i = 0; i < 5; i++) {
			System.out.println("Iteration " + (i + 1));
		}

		// Arrays
		int[] numbersArray = { 1, 2, 3, 4, 5 };

		// Enhanced for loop
		for (int numFromArray : numbersArray) {
			System.out.print(numFromArray + " ");
		}
		System.out.println();

		// ArrayList - a dynamic array
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");

		// Iterating through ArrayList
		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		// Methods
		try {
			int result = divide(10, 2);
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
		}

		// Object-oriented programming - creating an instance of a class
		Person person = new Person("John", 25);
		System.out.println("Person: " + person.getName() + ", Age: " + person.getAge());

		// Using the abstract class
		Dog myDog = new Dog();
		myDog.makeSound();

		// Using the interface
		Displayable displayable = new DisplayMessage();
		displayable.display();

		// Collections - List (ArrayList)
		List<Integer> numbersList = new ArrayList<>();
		numbersList.add(5);
		numbersList.add(2);
		numbersList.add(8);

		// Sorting using Collections
		Collections.sort(numbersList);
		System.out.println("Sorted Numbers: " + numbersList);

		// Generics - Creating a generic method
		String resultString = genericMethod("Hello, Generics!");
		System.out.println("Generic Method Result: " + resultString);

		// Comparators - Sorting using a custom comparator
		List<Person> peopleList = new ArrayList<>();
		peopleList.add(new Person("Alice", 30));
		peopleList.add(new Person("Bob", 25));
		peopleList.add(new Person("Charlie", 35));

		// Sorting peopleList by age using a comparator
		Collections.sort(peopleList, Comparator.comparingInt(Person::getAge));
		System.out.println("Sorted People List by Age: " + peopleList);
	}

	// Method to add two numbers
	public static int add(int a, int b) {
		return a + b;
	}

	// Method that may throw an exception
	public static int divide(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("Cannot divide by zero.");
		}
		return a / b;
	}

	// Class representing a Person
	static class Person {
		private String name;
		private int age;

		// Constructor
		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		// Getter methods
		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		// Overriding toString for better display
		@Override
		public String toString() {
			return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
		}
	}

	// Generic Method
	public static <T> T genericMethod(T input) {
		return input;
	}
}
