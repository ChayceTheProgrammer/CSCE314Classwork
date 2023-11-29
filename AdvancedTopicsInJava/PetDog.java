package AdvancedTopicsInJava;



//Inheritance: PetDog is a specific type of Dog and implements the Pet interface
class PetDog extends Dog implements Pet {
	public PetDog(String name) {
	   super(name);
	}

	@Override
	public void play() {
	   System.out.println(getName() + " is playing fetch.");
	}
}