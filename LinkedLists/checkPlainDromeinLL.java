package LinkedLists;

public class checkPlainDromeinLL {

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

    public static boolean checkIfPal(Node head){

                                //STEP 1 - Get the mid 1(even) and mid(odd) of LL 
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }


                                //STEP 2 - Reverse the second half
        Node newHead= reverseIt(slow.next);


                                //STEP 3 : Compare each node until equal/unequal -> reverse back -> return true/false;

        Node first = head;
        Node second = newHead;

        //we know second will reach the end and not first
        
        while(second!=null){

            if(first.data!=second.data){
                //reverse back new head and return true;
                reverseIt(newHead);
                return false;
            }

            first=first.next;
            second=second.next;

        
        }

        //revere back new head -> return true
        reverseIt(newHead);
        return true;

    }

    public static Node reverseIt(Node head){

        Node temp = head;
        Node back = null;


        while(temp!=null){
            Node front = temp.next;
            temp.next=back;

            back = temp;
            temp = front;
        }

        return back;

    }


    public static void main(String[] args) {

        int[] arr = {1,2,3,1,1};
        Node head = convert2LL(arr);

        // //MAKING LOOPED LL

        // // Create a LOOPED LL for testing
        // //Node temp = head;
        // Node last = head;
        // // Move last to the end
        // while (last.next != null) {
        //     last = last.next;
        // }
        // // Example: connect last node back to head.next (node with value 5)
        // last.next = head.next.next;


        print(head);   

        boolean hehe = checkIfPal(head);

        System.out.println(hehe);
        
    }
    
}
