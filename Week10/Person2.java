package Week10;

class Person2 implements Comparable<Person2> {
    private String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Custom object comparison using the 'equals' method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person2 person = (Person2) obj;
        return age == person.age && name.equals(person.name);
    }

    // Custom object comparison using the 'compareTo' method for Comparable
    @Override
    public int compareTo(Person2 person2) {
        return Integer.compare(age, person2.age);
    }

    @Override
    public String toString() {
        return name + " (age: " + age + ")";
    }
}

