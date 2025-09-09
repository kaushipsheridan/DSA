package LinkedLists;

public class checkForLoop {

    //NODE
    public static class Node{

        //VALUES
        int data; //data value
        Node next; //reference to next node in the LL

        //CONSTRUCTORS
        Node(int data1, Node next1){
            this.data=data1;    // Initialize data with the provided value
            this.next = next1;  // Initialize next with the provided reference
        }

        Node(int data1){
            this.data=data1;    //initialize data with provided value
            this.next=null;     // initalize next as null - AS THIS IS LAST NODE
        }


    }
     //function to CONVERTING TO LINKED LIST
    public static Node convert2LL(int[] arr ){

        //first we make head -> make it point to null( will update its pointer later)
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            //add a new node (temp) , add next value of array and make it point to null
            Node temp = new Node(arr[i]);
            //amke sure head/prev node's next point to this newly created node
            mover.next=temp;
            ////update the last node 
            mover=temp;
        }
        return head;
    }

    //PRINTING  LL
    public static void print(Node head){

        while(head!=null){
            System.out.print(head.data + " ");
            head=head.next;
        }
        System.out.println();
    }

    public static boolean checkLoopInLL(Node head){
        
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(fast!=null){
                if(fast.next==slow || fast==slow){
                return true;
                }
            }
 
        }
        
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {2,5,8,9,23,65,21};

        Node head = convert2LL(arr);

        // Create a LOOPED LL for testing
        Node temp = head;
        Node last = head;

        // Move last to the end
        while (last.next != null) {
            last = last.next;
        }

        // Example: connect last node back to head.next (node with value 5)
        last.next = head.next;

        //print(head);   

        boolean hehe = checkLoopInLL(head);

        System.out.println(hehe);
    }
}
