package FinalKeyword;

public class Driver {
	
	public static void main(String[] argv) {
	
	Base baseClass = new Base(3);	
	Derived derivedClass = new Derived(3);
		
	System.out.println(baseClass.toString2());
	System.out.println(derivedClass.toString2());
	
	derivedClass.setSubData(30);
	System.out.println(derivedClass.toString2());
	
	
	}

	
	
}
