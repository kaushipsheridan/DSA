package Queue;
import java.util.*;

import Concepts.SinglyLinkedList.LinkedList;

public class QueueUsingStack {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    //push
    public void push(int x){

        //step1
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }

        //step2
        s1.push(x);

        //step3
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    //top
    public int top(){
        return s1.peek();
    }

    //pop
    public int pop(){
        int hehe = s1.pop();
        return hehe;
    }

    // isEmpty
    public boolean isEmpty() {
        return s1.isEmpty();
    }

    public static void main(String[] args) {
         QueueUsingStack q = new QueueUsingStack();

        // List of commands
        String[] commands = {"StackQueue", "push", "push", 
                             "pop", "peek", "isEmpty"};
        // List of inputs
        int[][] inputs = {{}, {4}, {8}, {}, {}, {}};

        for (int i = 0; i < commands.length; i++) {
            if (commands[i].equals("push")) {
                q.push(inputs[i][0]);
                System.out.print("null ");
            } else if (commands[i].equals("pop")) {
                System.out.print(q.pop() + " ");
            } else if (commands[i].equals("isEmpty")) {
                System.out.print((q.isEmpty() ? "true" : "false") + " ");
            } else if (commands[i].equals("StackQueue")) {
                System.out.print("null ");
            }
        }
    }
    
}
