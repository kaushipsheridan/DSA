package Concepts.DoublyLinkedList;

public class deletionInDoublyLinkedList {

   public static class Node{
        int data;
        Node next;
        Node back;

        //c0nstructors

        Node(int data1, Node next1, Node back1){
            this.data=data1;
            this.next=next1;
            this.back=back1;
        }

        //empty constructor as well
        
        Node(int data1){
            this.data=data1;
            this.next=null;
            this.back=null;
        }
    }


    public static Node convertToDLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i],null,mover);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }

    public static void print(Node head){

        while(head!=null){
            System.out.print(head.data + " ");
            head=head.next;
        }
        System.out.println();
    }


    //DELETION OF HEAD IN DOUBLY LINKED LIST
    public static Node deletingHeadDLL(Node head){

        //if DLL is empty or only has one node
        if(head==null|| head.next==null){return null;}
    
        head=head.next;//assign new head
        head.back=null;//detach old head
        return head;
    }

    //DELETION OF TAIL IN A DOUBLY LINKED LIST
    public static Node deletingTailDLL(Node head){
        if(head==null || head.next==null){return null;}
        //make a temp node and store head in it 
        Node temp= head;
        //reach until second last Node - traverse
        while(temp.next.next!=null){
            temp=temp.next;
        }
        //clearing back reference of last node
        temp.next.back=null;
        //clear its NEXT
        temp.next=null;
        //return head;
        return head;
    }



    //DELETION ON KTH ELEMENT
    public static Node deleteKthElementInDLL(Node head, int k){

        //if list is empty, return null
        if(head==null) return null;

        if (k == 1) {
            head = head.next; // move head forward

            //now if it was a single node DLL, head will be null 
            //and if we directly try to clear the head.prev,
            // we will get error cause it doesn't exist

            //therefore we only unhook head.back if at this point head.back is not null
            if (head != null) {
                head.back = null; // only fix back if list is not empty now
            }
            return head;
        }


        int counter=1;
        Node prev=null;
        Node temp=head;

        while(temp!=null){

            //hanlde counter == k;

            if(counter==k){

                //this means that counter node is the tail
                if(prev.next.next==null){
                    //therefore we unhook it 
                    prev.next=null;

                    //now that prev node is the new tail, we can break;

                    break;
                    
                }
                //skipping counter node 
                prev.next= prev.next.next;
                //now that prev.next is the node after counter node
                //we can set this node's back to prev
                prev.next.back=prev;

                break;
            }

            //keeping prev behind temp
            prev=temp;
            //increasing temp until its equal to counter
            temp=temp.next;
            //increasing counter to keep track
            counter++;

        }
        return head;
    }

    public static Node deleteKthValueElement(Node head, int k){

        //if list is empty, return null
        if(head==null) return null;

        if (k == 1) {
            head = head.next; // move head forward

            //now if it was a single node DLL, head will be null 
            //and if we directly try to clear the head.prev,
            // we will get error cause it doesn't exist

            //therefore we only unhook head.back if at this point head.back is not null
            if (head != null) {
                head.back = null; // only fix back if list is not empty now
            }
            return head;
        }


        int counter=1;
        Node prev=null;
        Node temp=head;

        while(temp!=null){

            //hanlde counter == k;

            if(counter==k){

                //this means that counter node is the tail
                if(prev.next.next==null){
                    //therefore we unhook it 
                    prev.next=null;

                    //now that prev node is the new tail, we can break;

                    break;
                    
                }
                //skipping counter node 
                prev.next= prev.next.next;
                //now that prev.next is the node after counter node
                //we can set this node's back to prev
                prev.next.back=prev;

                break;
            }

            //keeping prev behind temp
            prev=temp;
            //increasing temp until its equal to counter
            temp=temp.next;
            //increasing counter to keep track
            counter++;

        }
        return head;

    }



    
    public static void main(String[] args) {
        
        int[] arr = {3,5,7,4,84};
        Node head = convertToDLL(arr);

        //removing head
        head=deleteKthElementInDLL(head,3);
        print(head);
        
    }
}
