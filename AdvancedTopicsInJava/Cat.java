package AdvancedTopicsInJava;

//Inheritance: Cat is a specific type of Animal
class Cat extends Animal {
	 public Cat(String name) {
	     super(name);
	 }
	
	 // Polymorphism: Override makeSound method for the Cat
	 @Override
	 public void makeSound() {
	     System.out.println(getName() + " meows.");
	 }
	
	 public String getName() {
	     return super.getName();
	 }
}