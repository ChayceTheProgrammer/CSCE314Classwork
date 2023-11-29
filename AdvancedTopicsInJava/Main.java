package AdvancedTopicsInJava;

/*
In this example:

Inheritance is demonstrated through the relationships between 
Animal, Dog, and Cat, where Dog and Cat are specific types of Animal.

Polymorphism is demonstrated when we create an array of Animal objects 
and call makeSound and other methods. The specific implementation of makeSound 
is determined at runtime based on the actual object type.

Abstraction is shown through the abstract class Animal and the abstract method 
makeSound. Subclasses (Dog and Cat) must provide concrete implementations for makeSound.

Interfaces are demonstrated with the Pet interface, which is implemented by the PetDog 
and PetCat classes. They provide a play method, which enforces a common behavior for pets.

This example showcases the key principles of object-oriented programming in Java: Inheritance, 
Polymorphism, Abstraction, and the use of Interfaces.
*/

//Interface defining behaviors for a Pet
interface Pet {
	void play();
}

public class Main {
    public static void main(String[] args) {
        // Polymorphism: Using an array of animals to demonstrate polymorphism
        Animal[] animals = new Animal[4];
        animals[0] = new Dog("Rex");
        animals[1] = new Cat("Whiskers");
        animals[2] = new PetDog("Buddy");
        animals[3] = new PetCat("Mittens");

        for (Animal animal : animals) {
            animal.makeSound();
            animal.eat();

            if (animal instanceof Pet) {
                Pet pet = (Pet) animal;
                pet.play();
            }

            System.out.println();
        }
    }
}