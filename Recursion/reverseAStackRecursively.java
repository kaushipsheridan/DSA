package Recursion;

import java.util.Stack;

public class reverseAStackRecursively {


     public static void emptyStack (Stack<Integer> st){

        //getting all the elements in a stack(using memory stacking here) and putting them to insertStack function
        if(!st.isEmpty()){
         int temp = st.pop();
         emptyStack(st);
         insertStack(st,temp);
        }
    }

    public static void insertStack(Stack<Integer> st, int temp){
        
        if(st.isEmpty()){
            st.push(temp);
            return;
        }

        int top = st.pop();
        insertStack(st, temp);
        st.push(top);
    }


        public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(1);
        stack.push(3);
        stack.push(2);

        // Print the Normal stack
        System.out.print("Normal Stack ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        System.out.println();

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(4);
        stack2.push(1);
        stack2.push(3);
        stack2.push(2);

        emptyStack(stack2);

        // Print the After stack
        System.out.print("Reversed Stack ");
        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop() + " ");
        }
        
    }
}
