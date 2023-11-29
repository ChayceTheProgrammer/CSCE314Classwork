package TypeErasure;

import java.util.ArrayList;
import java.util.List;

/*
In Java, type erasure is a process by which the generic type information is removed at runtime. 
This means that the type parameters used in generic classes or methods are not retained in the compiled bytecode, 
which allows for compatibility with older Java code that does not have generics. Type erasure ensures that the generic 
type information is not available at runtime, which is known as "type erasure."
*/

public class TypeErasureDemo {
	public static void main(String[] args) {
		// Create a list of integers
		List<Integer> integerList = new ArrayList<>();
		integerList.add(42);

		// Create a list of strings
		List<String> stringList = new ArrayList<>();
		stringList.add("Hello, Generics!");

		// Check if the lists are of the same type (at runtime)
		boolean isSameType = integerList.getClass() == stringList.getClass();
		System.out.println("Are the lists of the same type? " + isSameType);
	}
}
