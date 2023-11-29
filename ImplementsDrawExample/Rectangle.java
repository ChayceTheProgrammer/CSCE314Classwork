package ImplementsDrawExample;

//Another class that implements the "Drawable" interface
public class Rectangle implements Drawable {
private int width;
private int height;

public Rectangle(int width, int height) {
   this.width = width;
   this.height = height;
}

@Override
public void draw() {
   System.out.println("Drawing a rectangle with width " + width + " and height " + height);
}
}