package Concepts.LinkedList;

public class LinkedList {

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
    

    public static void main(String[] args) {

        int[] arr = {2, 5, 8, 7};


        // Creating a new Node with the value from the array
        Node x = new Node(arr[0],null);

        // Printing location of x and the data stored in the Node x
        System.out.println(x);
        System.out.println(x.data);
        

    }
    
}
