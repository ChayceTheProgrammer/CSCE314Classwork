package Week11;

public class Cube {
	private double side;
	
	public void setSide(double x ) {side = x;}
	public double getSide() {return side;}
	
	//overrides java.lang.Object.toString()
	public String toString() {return "This cube's sides are " + getSide() + " long";}
	
}
