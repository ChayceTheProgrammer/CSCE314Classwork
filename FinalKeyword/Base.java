package FinalKeyword;

public class Base {
	
	private int data;
	public Base(int n) {data = n;}
	
	public int getData() {return data;}
	
	//no longer can override toString() in subclasses because of 'final' keyword
	public final String toString() {return "base's data: " + data;}
	
	public String toString2() {
		return toString() +  "\n";
	}
	
}
