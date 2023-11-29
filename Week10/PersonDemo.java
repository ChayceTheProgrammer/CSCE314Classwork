package Week10;

public class PersonDemo {
	public static void main(String[] args) {
		
		//declaration of person object
		Person person1 = new Person("John", 21);

		Person person2;

		person2 = person1;

		person2.changeDetails("Mary", 30);

		//should print Mary 30
		System.out.println(person1);

		person2.changeDetails("Reggie", 55);
		System.out.println(person1);

	}

}
