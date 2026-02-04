package Queue;

public class QueueImplLL {

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
    private Node start;
    private Node end;
    private int size;

    // constructor
    public QueueImplLL() {
        size = 0;
        start = null;
        end=null;
    }

    public void push(int x){

        Node temp= new Node(x);

        //checking if its the first push
        if(start==null){
            start= temp;
            end=temp;
        }else{
            //not the first node, udpate end
            end.next=temp;
            end = end.next;
        }

        size++;

    }

    public int pop(){

        //edge case, if start ==null
        if(start==null){System.out.println("Q is empty");return -1;}

        Node temp=start;
        int toreturn = temp.val;
        start=start.next;

        //if we pop the last element
        if (start == null) {
            end = null;
        }

        //else
        temp.next=null;

        size--;

        return toreturn;
    }

    public int peek(){
        //edge case, if start ==null
        if(start==null){System.out.println("Q is empty");return -1;}
        return start.val;
    }





    public static void main(String[] args) {

         QueueImplLL q = new QueueImplLL();

        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println("Peek: " + q.peek()); // 10

        System.out.println("Pop: " + q.pop()); // 10
        System.out.println("Pop: " + q.pop()); // 20

        System.out.println("Pop: " + q.pop()); // 30
        System.out.println("Pop: " + q.pop()); // empty case
        
    }
    
}
