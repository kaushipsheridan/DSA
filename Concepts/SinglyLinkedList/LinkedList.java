package Concepts.SinglyLinkedList;

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



    public static void main(String[] args) {

        int[] arr = {2, 5, 8, 7};
 
        // // Creating a new Node with the value from the array
        // Node x = new Node(arr[0],null);

        // // Printing location of x and the data stored in the Node x
        // System.out.println(x);
        // System.out.println(x.data);

        Node head = convert2LL(arr);
        System.out.println(head.data);


        //TRAVERSE IN A LINKED LIST(with couuning)(with SEARCHING AN ELEMENT IN A LL//
        Node temp = head;
        
        //FOR COUNTING
        int counter =0;

        //FOR SEARCHING AN ELEMENT
        int val =17;
        boolean isPresent=false;

        while(temp!=null){
            System.out.print(temp.data + " "); //prints -> 2 5 8 7  

            //counting elements
            counter++;

            //searching if present
            if(temp.data==val){
                isPresent=true;
            }
            temp=temp.next;
        }
                                                 System.out.println();
        System.out.println(counter+ " is the counter");
        System.out.println("Element present status -> "+ isPresent);


        


        



        

    }
    
}
