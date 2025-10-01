package LinkedLists;
public class flattenLinkedList {

    public static class Node{
        int data;
        Node next;
        Node child;

        //constructors
        Node(int data, Node next,Node child){
            this.data=data;
            this.next=next;
            this.child=child;
        }

        Node(int data){
            this.data=data;
            this.next=null;
            this.child=null;
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


                        //NOW HANDLING FLATENING AND MERGING 2 LL

    public static Node merge2LL(Node first, Node second){

        //creating a dummy code as the head( will later return dummy.next as head(hehe))44
        Node dummy = new Node(-1);
        Node res = dummy;

        while(first!=null && second!=null){
            if(first.data<second.data){
                res.child=first;
                res=first;
                first= first.child;
            }else{
                res.child=second;
                res=second;
                second=second.child;
            }

            res.next=null;
        }

        //now there can be remaining elements in first or second
        if(first!=null){
            res.child=first;
        }else{
            res.child=second;
        }


        //now remember-> dummyNode .child is the new head we want
        //and at this moment it is connnected to the rest of the list
        //so we gotta break that connection

        if(dummy.child!=null){
            dummy.child.next=null;
        }

        return dummy.child;
    }

    //this will recursively pass 2 Nodes and their children into the merge2LL function 
    //until the entire linkedList is merged into a single one in sorted manner
    public static Node flattenLinkedList(Node head){

        //hanlding null exceptions
        if(head==null ||head.next==null){
            return head;
        }

        head.next= flattenLinkedList(head.next);

        head = merge2LL(head,head.next);
        
        return head;
    }


                        //PRINTING LINKED LISTS - OG AS WELL AS FLATTENED

    public static void printListRecursive(Node node, int level) {
    while (node != null) {
        // indent children for clarity
        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }
        System.out.println(node.data);

        // go down the child list
        if (node.child != null) {
            printListRecursive(node.child, level + 1);
        }

        // move to next node on the same level
        node = node.next;
    }
}

    // Print the linked list by
    // traversing through child pointers
    public static void printLinkedList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.child;
        }
        System.out.println();
    }





    public static void main(String[] args) {

    // Create a linked list with child pointers
    Node head = new Node(5);
    head.child = new Node(7);
    head.child.child = new Node(8);
    head.child.child.child = new Node(30);

    head.next = new Node(10);
    head.next.child = new Node(20);

    head.next.next = new Node(19);
    head.next.next.child = new Node(22);
    head.next.next.child.child = new Node(50);

    head.next.next.next = new Node(28);
    head.next.next.next.child = new Node(35);
    head.next.next.next.child.child = new Node(40);
    head.next.next.next.child.child.child = new Node(45);

    // Print the original linked list structure
    System.out.println("Original linked list:");
    printListRecursive(head, 0);

    // Flatten the linked list and print the flattened list
    Node flattened = flattenLinkedList(head);
    System.out.print("\nFlattened linked list: ");
    printLinkedList(flattened);
}

    
}
