package Stack;
import java.util.*;

import Strings.largestOddNumber;
public class StackUsingQueue {

    Queue<Integer> q = new LinkedList<>();

    //push
    public void push(int x){

        int size = q.size();

        //firstly lets add the element
        q.add(x);

        //moving the elements - prev to newly added ones - at the back
        for(int i=0;i<size;i++){
            q.add(q.poll());
        }
    }


    //POP
    public int pop(){
        //seeking front element's value
        int n =q.peek();
        //removing front element
        q.poll();
    
        return n;
    }

    //PEEK
    public int peek(){
        return q.peek();
    }

    //CHECK Empty
    public boolean isEmpty(){
        return q.isEmpty();
    }






    public static void main(String[] args) {
        StackUsingQueue st = new StackUsingQueue();
        
        // Array of commands
        String[] commands = {"QueueStack", "push", "push", 
                             "pop", "top", "isEmpty"};
        int[][] inputs = {{}, {4}, {8}, {}, {}, {}};

        for (int i = 0; i < commands.length; ++i) {
            switch (commands[i]) {
                case "push":
                    st.push(inputs[i][0]);
                    System.out.print("null ");
                    break;
                case "pop":
                    System.out.print(st.pop() + " ");
                    break;
                case "isEmpty":
                    System.out.print(st.isEmpty() ? "true " : "false ");
                    break;
                case "QueueStack":
                    System.out.print("null ");
                    break;
            }
        }
    }
}
