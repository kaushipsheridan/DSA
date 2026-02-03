package Stack;

import java.util.Arrays;
import java.util.List;

public class StackImplArray {

    private int[] stackArray;
    private int capacity;
    private int topIndex;

    //constructors
    public StackImplArray(int size){
        capacity=size;
        stackArray=new int[capacity];
        topIndex=-1;
        
    }

    public StackImplArray(){
        this(1000);
    }

    //FXN to PUSH
    public void push(int x){
        if(topIndex>=capacity-1){
            System.out.println("Stack Overflow");
            return;
        }
        stackArray[++topIndex]=x;
    }

    //FNX to POP
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack empty");
            return -1;
        }

        return stackArray[topIndex--];
    }


    //FXN to TOP 
    public int top(){
        if(isEmpty()){
            System.out.println("STACK IS EMPTY");
            return -1;
        }

        return stackArray[topIndex];
    }

    //FXN to check isEmpty
    public boolean isEmpty() {
        return topIndex == -1;
    }




    public static void main(String[] args) {
        StackImplArray stack = new StackImplArray();

        List<String> commands = Arrays.asList("StackImplArray", "push", "push", "top", "pop", "isEmpty");
        List<List<Integer>> inputs = Arrays.asList(
                Arrays.asList(),
                Arrays.asList(5),
                Arrays.asList(10),
                Arrays.asList(),
                Arrays.asList(),
                Arrays.asList()
        );

        for (int i = 0; i < commands.size(); ++i) {
            switch (commands.get(i)) {
                case "push":
                    stack.push(inputs.get(i).get(0));
                    System.out.print("null ");
                    break;
                case "pop":
                    System.out.print(stack.pop() + " ");
                    break;
                case "top":
                    System.out.print(stack.top() + " ");
                    break;
                case "isEmpty":
                    System.out.print(stack.isEmpty() + " ");
                    break;
                case "StackImplArray":
                    System.out.print("null ");
                    break;
            }
        }
    }
    
}
