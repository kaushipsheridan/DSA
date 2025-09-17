package LinkedLists;

import Concepts.SinglyLinkedList.LinkedList;

public class sort123inLL {

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

    //PRINTING THE LL
    public static void print(Node head){

        while(head!=null){
            System.out.print(head.data + " ");
            head=head.next;
        }
        System.out.println();
    }

    //Sorting function
    public static Node SortLLNow(Node head){

        //HEAD
        Node ZeroLL = new Node(-1);
        Node OneLL = new Node(-1);
        Node TwoLL = new Node(-1);

        //MOVERS
        Node tempZero = ZeroLL;
        Node tempOne= OneLL;
        Node tempTwo= TwoLL;

        Node temp = head;

        //LOOPING though entire LL and storing it in respective LL
        while(temp!=null){

            if(temp.data==0){
                tempZero.next= temp;
                tempZero= tempZero.next;
            }

            if(temp.data==1){
                tempOne.next= temp;
                tempOne= tempOne.next;
            }

            if(temp.data==2){
                tempTwo.next= temp;
                tempTwo= tempTwo.next;
            }

            temp = temp.next;

        }

        //now connecting all of the Nodes
        // Connect lists safely
        tempZero.next = (OneLL.next != null) ? OneLL.next : TwoLL.next;
        tempOne.next  = TwoLL.next;
        tempTwo.next  = null;  // terminate

        return (ZeroLL.next != null) ? ZeroLL.next : (OneLL.next != null ? OneLL.next : TwoLL.next);


        
    }

    public static void main(String[] args) {
        int[] arr = {1,0,1,2,0,2,1};

        Node head = convert2LL(arr);

        head = SortLLNow(head);

        print(head);

    }



    
    
}
