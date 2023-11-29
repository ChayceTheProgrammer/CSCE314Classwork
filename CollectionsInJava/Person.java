package CollectionsInJava;

import java.util.Comparator;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
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
	public String toString() {
		return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
	}
}

class AgeComparator implements Comparator<Person> {
	@Override
	public int compare(Person person1, Person person2) {
		return Integer.compare(person1.getAge(), person2.getAge());
	}
}
