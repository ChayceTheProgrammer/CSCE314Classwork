package PolymorphismAndAbstraction;

public class PolymorphismExample {
	
	public static void printArea(Shape shape) {
        System.out.println("Area: " + shape.area());
    }
	
	public static void main(String[] args) {
        Shape shape1 = new Circle(5.0);
        Shape shape2 = new Rectangle(4.0, 6.0);

        // Calling the area() method on different shapes, demonstrating polymorphism
        System.out.println("Area of Circle: " + shape1.area());
        System.out.println("Area of Rectangle: " + shape2.area());
        
        // Create an array of Shape objects
        Shape[] shapes = new Shape[4];

        // Initialize the array with Circle and Rectangle objects
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
        shapes[2] = new Circle(3.0);
        shapes[3] = new Rectangle(2.0, 8.0);

        // Iterate through the array and calculate the area for each shape
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.area());
        }
        
        // Iterate through the array and calculate the area for each shape
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("Area of Circle: " + shape.area());
            } else if (shape instanceof Rectangle) {
                System.out.println("Area of Rectangle: " + shape.area());
            } else {
                System.out.println("Unknown Shape");
            }
        }
	
	}
	
}
