package Recursion;
import java.util.Stack;

public class sortAStackRecursive {

    public static void sortStack (Stack<Integer> st){

        //getting all the elements in a stack(using memory stacking here) and putting them to insertStack function
        if(!st.isEmpty()){
         int temp = st.pop();
         sortStack(st);
         insertStack(st,temp);
        }
    }

    public static void insertStack(Stack<Integer> st, int temp){

        //BASE CASE - IF STACK IS EMPTY (first element -> just push it)
        //IF stack has top element <temp -> push temp (already in decending order)
        if(st.isEmpty() || st.peek()<temp){
            st.push(temp);
            return;
        }

        int element = st.pop();
        insertStack(st, temp);
        st.push(element);

    }




    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(1);
        stack.push(3);
        stack.push(2);

        sortStack(stack);

        // Print the sorted stack
        System.out.print("Sorted stack (descending order): ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
    
}
