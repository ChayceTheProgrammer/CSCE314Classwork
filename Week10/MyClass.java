package Week10;

public class MyClass {
    private String name;

    // Constructor: Initializes the object
    public MyClass(String name) {
        this.name = name;
        System.out.println("Constructor called. Object created with name: " + name);
    }

    public void display() {
        System.out.println("Object name: " + name);
    }

    public static void main(String[] args) {
        // Create an instance of MyClass by calling the constructor
        MyClass obj1 = new MyClass("Object 1");
        obj1.display();

        // Create another instance of MyClass
        MyClass obj2 = new MyClass("Object 2");
        obj2.display();
    }
}
