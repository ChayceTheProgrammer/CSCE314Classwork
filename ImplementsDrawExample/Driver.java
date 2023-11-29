package ImplementsDrawExample;

/*
Differences between Abstract and Implements
Features:					Abstract							Implements
-types of methods    		Abstract-Non Abstract				Abstract
-member variables			freedom of declaration				defaults to final
-subclass uses to connect	"extends" a class					"implements"
-members in general			freedom of specifier				"public by default"
-overall length				more freedom, more code				"very short"
-inheritance				subclass can only inherit 1 class 	subclass can implement many interfaces
*/
//Define an interface named "Drawable"
interface Drawable {
void draw(); // Method to be implemented by classes that implement the interface
}

public class Driver{

public static void main(String[] args) {

     Drawable circle = new Circle(5);
     Drawable rectangle = new Rectangle(4, 6);

     circle.draw(); // Calls the draw() method of Circle
     rectangle.draw(); // Calls the draw() method of Rectangle
}

}
