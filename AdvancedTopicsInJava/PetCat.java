package AdvancedTopicsInJava;

//Inheritance: PetCat is a specific type of Cat and implements the Pet interface
class PetCat extends Cat implements Pet {
	 public PetCat(String name) {
	     super(name);
}

	 @Override
	 public void play() {
		 System.out.println(getName() + " is chasing a toy mouse.");
	 }
}