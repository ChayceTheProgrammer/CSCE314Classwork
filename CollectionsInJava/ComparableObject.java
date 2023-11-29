package CollectionsInJava;

public class ComparableObject implements Comparable<ComparableObject> {
	private String name;
	private int age;

	public ComparableObject(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(ComparableObject other) {
		// Compare objects based on age
		return Integer.compare(this.age, other.age);
	}

	public int compareByName(ComparableObject other) {
		// Compare objects based on name (lexicographically)
		return this.name.compareTo(other.name);
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Age: " + age;
	}
}
