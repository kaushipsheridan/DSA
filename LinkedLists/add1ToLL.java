package LinkedLists;

public class add1ToLL {

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

    public static Node reverseItIterative(Node head){

        Node temp = head;
        Node back = null;

        while(temp!=null){

            //store front 
            Node front = temp.next;

            temp.next= back;

            back= temp;
            temp = front;

        }

        return back;
    }   


    public static Node calculateNow(Node head){

        Node temp = head;

        int carry = 1;
        while(temp!=null){

            int total = temp.data+carry;

            if(total == 10){
                carry=1;
                temp.data=0;

                if(temp.next==null){
                    temp.data =0;
                    Node temp2 = new Node(1);
                    temp.next = temp2;
                    break;
                }
            
            }else{
                temp.data=temp.data+carry;
                carry = 0;
            }

            temp = temp.next;
            total = 0;

        }

        return head;
    }


    public static void main(String[] args) {

          int[] arr = {9,9,9};

        Node head = convert2LL(arr);

        print(head);

        head = reverseItIterative(head);

        head = calculateNow(head);

        head = reverseItIterative(head);

        print(head);
        
    }
}
