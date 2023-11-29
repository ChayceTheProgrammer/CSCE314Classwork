package AdvancedTopicsInJava;

//Inheritance: Dog is a specific type of Animal
class Dog extends Animal {
	public Dog(String name) {
        super(name);
    }

    // Polymorphism: Override makeSound method for the Dog
    @Override
    public void makeSound() {
        System.out.println(getName() + " barks.");
    }

    public String getName() {
        return super.getName();
    }
}
