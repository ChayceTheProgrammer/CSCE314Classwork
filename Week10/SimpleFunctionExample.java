package Week10;

public class SimpleFunctionExample {
    // Define a function that calculates the sum of two numbers
    public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        // Call the function and store the result in a variable
        int num1 = 5;
        int num2 = 7;
        int result = addNumbers(num1, num2);

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
    }
}
