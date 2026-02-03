package Queue;

import java.util.IntSummaryStatistics;

public class QueueImplArray {

    private int[]queueArray;
    private int capacity;
    private int start;
    private int end; 
    private int currentSize;

    //constructor
    public  QueueImplArray(int size){
    
        capacity=size;
        start=-1;
        end=-1;
        queueArray=new int[capacity];
        currentSize=0;
    }

    public QueueImplArray(){
        this(10);
    }

    //PUSH
    public void push(int n){

        //making sure we have capacity
        if(currentSize==capacity){
            System.out.println("Queue Overflow");
            return;
        }

        //if this if first element
        if(currentSize==0){
            start=0;end=0;
        }else{
            //move only end
            end=(end+1)%capacity;
        }

        //adding n to queue now
        queueArray[end]=n;
        currentSize++;

    }

    //POP
    public int pop(){
        if(currentSize==0){
            System.out.println("Queue is empty");
            return -1;
        }

        //storing first elem
        int first = queueArray[start];

        //only one elem-> remove it , but first store it like done above
        if(currentSize==1){
            start=end=1;
        }else{
            end =(end+1)%capacity;
        }

        currentSize--;
        return first;
    }

    public int top(){
        if(currentSize==0){
            System.out.println("Queue is empty");
            return -1;
        }

        return queueArray[start];
    }

    public int size(){
       return currentSize; 
    }

    public boolean isEmpty(){
        if(currentSize==0){return true;}
        return false;
    }

    public static void main(String[] args) {

    QueueImplArray queue = new QueueImplArray();

    String[] commands = {
        "ArrayQueue", "push", "push",
        "peek", "pop", "isEmpty"
    };

    int[][] inputs = {
        {}, {5}, {10}, {}, {}, {}
    };

    for (int i = 0; i < commands.length; ++i) {
        switch (commands[i]) {

            case "push":
                queue.push(inputs[i][0]);
                System.out.print("null ");
                break;

            case "pop":
                System.out.print(queue.pop() + " ");
                break;

            case "peek":   // using your top()
                System.out.print(queue.top() + " ");
                break;

            case "isEmpty":
                System.out.print(queue.isEmpty() ? "true " : "false ");
                break;

            case "ArrayQueue":
                System.out.print("null ");
                break;
        }
    }
}


    
}
