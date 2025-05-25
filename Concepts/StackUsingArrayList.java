package Concepts;

import java.util.ArrayList;

public class StackUsingArrayList<T> {

    //Intiialsing ArrayList - Generic type
    private ArrayList<T> stack;

    //Constructor for the stack
    public StackUsingArrayList(){
        stack = new ArrayList<>();
    }

    //PUSH - Adding an element to the STACK
    public void push(T item){
        stack.add(item);
    }    

    // Pop: Remove and return the top element of the stack
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot pop.");
        }
        return stack.remove(stack.size() - 1); // O(1) average time
    }

    // Peek: Return the top element without removing it
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot peek.");
        }
        return stack.get(stack.size() - 1); // O(1)
    }

    // isEmpty: Check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty(); // O(1)
    }

    // size: Return the number of elements in the stack
    public int size() {
        return stack.size(); // O(1)
    }

    // Display stack elements (top to bottom)
    public void printStack() {
        System.out.println("Stack (top to bottom):");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }
}
