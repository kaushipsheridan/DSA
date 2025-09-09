package LinkedLists;

import java.util.Stack;

public class reverseALinkedListIterative {

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

    // //Brute Force : TC is O(n) SC is O(n)
    // public static Node reverseItIterative(Node head){

    //     Node temp = head;
        
    //     //first we input all of our node.data into a stack
    //     Stack<Integer> st = new Stack<>();

    //     while(temp!=null){
    //         st.push(temp.data);
    //         temp=temp.next;
    //     }

    //     //now that stack is ready,lets pop every element back into the LL
    //     temp=head;

    //     while(temp!=null){
    //         temp.data=st.pop();
    //         temp=temp.next;
    //     }

    //     return head;
    // }

    public static Node reverseItIterative(Node head){
        
        Node back = null;
        Node temp = head;

        while(temp!=null){
            //STORE FRONT
           Node front=temp.next;
           
           //UPDATE POINTER FROM FRONT TO BACK
           temp.next=back;

           //UPDATE BACK AND FRONT
           back=temp;
           temp=front;
        }
        return back;
    }



    public static void main(String[] args) {

        int[] arr = {2,5,8,9,23,65,21};

        Node head = convert2LL(arr);

        print(head);   

        head = reverseItIterative(head);

        print(head);
        
    }
    
}
