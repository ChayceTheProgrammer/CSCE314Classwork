package ImplementsDrawExample;

//Create a class that implements the "Drawable" interface
public class Circle implements Drawable {
	private int radius;
	
	public Circle(int radius) {
	   this.radius = radius;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
	   System.out.println("Drawing a circle with radius " + radius + ".");

	
	}
}