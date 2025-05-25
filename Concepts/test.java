package Concepts;

public class test {

    public static void main(String[] args) {

        
        StackUsingArrayList<Integer> stack = new StackUsingArrayList<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Print the stack
        stack.printStack(); // Should print: 30, 20, 10

        // Peek the top element
        System.out.println("Top element: " + stack.peek());

        // Pop an element
        System.out.println("Popped: " + stack.pop());

        // Print the stack again
        stack.printStack();

        // Stack size
        System.out.println("Stack size: " + stack.size());

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
    
}
