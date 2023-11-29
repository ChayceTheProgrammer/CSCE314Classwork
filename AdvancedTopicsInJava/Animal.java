package AdvancedTopicsInJava;

//Abstract class representing a generic Animal
abstract class Animal {
	 private String name;
	
	 public Animal(String name) {
	     this.name = name;
	 }
	
	 // Abstract method to make a sound
	 public abstract void makeSound();
	 
	 public String getName() {
		 return name;
	 }
	
	 public void eat() {
	     System.out.println(name + " is eating.");
	 }
}