package GenericsInJava;

public class GenericsInJava<T> {
	// A generic field that can hold values of type T
	private T genericField;

	// Constructor that initializes the generic field
	public GenericsInJava(T genericField) {
		this.genericField = genericField;
	}

	// Getter for the generic field
	public T getGenericField() {
		return genericField;
	}

	// Setter for the generic field
	public void setGenericField(T genericField) {
		this.genericField = genericField;
	}

	// Generic method that prints the contents of an array
	public static <E> void printArray(E[] array) {
		for (E element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// Create instances of GenericExample with different types
		GenericsInJava<Integer> intExample = new GenericsInJava<>(42);
		GenericsInJava<String> strExample = new GenericsInJava<>("Hello, Generics!");

		// Get and set generic fields
		System.out.println("Integer Example: " + intExample.getGenericField());
		System.out.println("String Example: " + strExample.getGenericField());

		intExample.setGenericField(123);
		strExample.setGenericField("Generics are great!");

		System.out.println("Updated Integer Example: " + intExample.getGenericField());
		System.out.println("Updated String Example: " + strExample.getGenericField());

		// Using the generic method to print arrays
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		String[] strArray = { "apple", "banana", "cherry" };

		System.out.print("Integer Array: ");
		printArray(intArray);

		System.out.print("String Array: ");
		printArray(strArray);
	}
}
