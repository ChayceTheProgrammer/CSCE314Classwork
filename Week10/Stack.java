/**
 * 
 */
package Week10;

/**
 * 
 */
public class Stack {
    
    private int maxSize; 	//Max number of elements of stack
    private int top;		//Top of the stack
    private int[] stackArray; 	//Array to Store elements
    
    //constructor to initialize stack
    public Stack(int size) {
	maxSize = size;
	stackArray = new int[maxSize];
        top = -1; // Initialize the top as -1 to indicate an empty stack
    }
    
    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int[] getStackArray() {
        return stackArray;
    }

    public void setStackArray(int[] stackArray) {
        this.stackArray = stackArray;
    }

    // Push an element onto the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value;
        }
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Return a sentinel value or handle differently
        } else {
            return stackArray[top--];
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }

    // Get the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Return a sentinel value or handle differently
        } else {
            return stackArray[top];
        }
    }

    // Get the size of the stack
    public int size() {
        return top + 1;
    }

    // Display the elements of the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.display(); // Stack elements: 1 2 3

        System.out.println("Popped: " + stack.pop()); // Popped: 3
        System.out.println("Popped: " + stack.pop()); // Popped: 2

        System.out.println("Is stack empty? " + stack.isEmpty()); // Is stack empty? false
        System.out.println("Stack size: " + stack.size());       // Stack size: 1
        System.out.println("Top element: " + stack.peek());       // Top element: 1
        
        System.out.println("------Debugging-------");
        
        Stack stack2 = new Stack(100);
        for(int i = 0; i < 100; i++) {
        	stack2.peek();
            stack2.push(i);
            stack2.peek();
            stack2.display();
        }
    }
}