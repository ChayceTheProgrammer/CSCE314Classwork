package CollectionsInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GetVsIteratorNext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");

		String fruit = fruits.get(1); // Retrieves the element at index 1 (second element)
		System.out.println(fruit); // Output: Banana

		List<String> fruits2 = new ArrayList<>();
		fruits2.add("Apple");
		fruits2.add("Banana");
		fruits2.add("Orange");

		Iterator<String> iterator = fruits.iterator();
		while (iterator.hasNext()) {
			String fruit2 = iterator.next();
			System.out.println(fruit2);
		}

		List<String> fruits3 = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");

		Iterator<String> iterator2 = fruits3.iterator();
		while (iterator2.hasNext()) {
			String fruit3 = iterator2.next(); // Retrieves the next element
			System.out.println(fruit3);
		}

	}

}
