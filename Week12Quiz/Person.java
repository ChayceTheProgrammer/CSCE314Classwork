package Week12Quiz;

public class Person {
	private String name;

	public Person(String string) {
		// TODO Auto-generated constructor stub
		this.name = string;
	}

	public String getName() {
		return name;
	}

	public static int compare(Person a, Person b) {

		return a.getName().compareTo(b.getName());

	}

	public static void main(String args[]) {
		Person p1 = new Person("P1");
		Person p2 = new Person("P1");
		Person p3 = new Person("P3");
		Person p4 = new Person("P4");
		Person p5 = new Person("P5");

		System.out.println(compare(p5, p4)); // Compares "P5" with "P4"
		System.out.println(compare(p3, p2)); // Compares "P3" with "P1"
	}
}
