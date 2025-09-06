package LinkedLists;

public class medianOfSLL {

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
        
    }
    
}
