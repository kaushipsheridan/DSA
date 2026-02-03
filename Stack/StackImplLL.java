package Stack;

public class StackImplLL {

    // Node structure
    class Node {
        int val;
        Node next;
        Node(int d) {
            val = d;
            next = null;
        }
    }

    private Node head;
    private Node top;
    private int size;

    // constructor
    public StackImplLL() {
        size = 0;
        top = null;
    }

    //PUSH
    public void push(int x){
        Node temp = new Node(x);

        //wherever top is, make sure temp.next points to that node
        temp.next=top;
        //udpate top node as we have a new top
        top=temp;
        //inc size
        size++;
    }

    //POP
    public int pop(){

        if(head==null){
            //nothing in the LL return -1
            return -1;
        }
        Node temp = top;
        //pull out value of temp to return later
        int val= top.val;
        //update top
        top=top.next;
        //delete temp
        temp=null;
        //reduce size
        size--;
        return val;
        
    }

    public boolean isEmpty() {

        if(head==null){
            //nothing in the LL return -1
            return true;
        }

        return (size == 0);
    }

    public int peek(){

        if(head==null){
            //nothing in the LL return -1
            return -1;
        }

        return top.val;
    }



    public static void main(String[] args) {

    StackImplLL stack = new StackImplLL();

    String[] commands = {
        "StackImplLL", "push", "push",
        "peek", "pop", "isEmpty"
    };

    int[][] inputs = {
        {}, {5}, {10}, {}, {}, {}
    };

    for (int i = 0; i < commands.length; ++i) {
        switch (commands[i]) {

            case "push":
                stack.push(inputs[i][0]);
                System.out.print("null ");
                break;

            case "pop":
                System.out.print(stack.pop() + " ");
                break;

            case "peek":
                System.out.print(stack.peek() + " ");
                break;

            case "isEmpty":
                System.out.print(stack.isEmpty() ? "true " : "false ");
                break;

            case "StackImplLL":
                System.out.print("null ");
                break;
        }
    }
}


}
