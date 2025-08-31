package Concepts.SinglyLinkedList;

public class insertioninLL {

    public static class Node{
        int data;
        Node next;

        //constructors
        Node(int data1,Node next1){
            this.data=data1;
            this.next=next1;
        }

        Node(int data1){
            this.data=data1;
            this.next=null;
        }
    }

    public static Node convert2LL(int[] arr){

        Node head = new Node(arr[0]);

        Node mover=head;

        for(int i=1;i<arr.length;i++){
            Node temp= new Node(arr[i]);
            mover.next=temp;
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



    // ADDING A NODE AT HEAD 
    public static Node addAtHead(Node head,int b){

        //add a new node, make it point to head
        Node temp=new Node(b,head);
        //return the new node as this is the head now
        return temp;
    }


    //ADDING A NODE AT TAIL
    public static Node addAtTail(Node head, int b){

        //edge cases(if LL is empty)
        if(head==null){
            return new Node(b);
        }
        
        //store head as temp
        Node temp=head;

        //go until last element
        while(temp.next!=null){
            temp=temp.next;
        }   

        //make a new node of val(make sure it points to null)
        Node newTail= new Node(b);

        //update the tail
        temp.next=newTail;

        return head;

    }


    public static Node insertAtKthElement(Node head, int element, int k){

        //edge case 
        //if LL is empty
        if(head==null){
            if(k==1){
                return new Node(element);
            }else{
                new IndexOutOfBoundsException();
            }
        }

        //if, asked to be inserted at 1
        if(k==1){
            Node temp= new Node(element,head);
            return temp; 
        }

        int counter=0; 
        Node temp = head;

        while(temp!=null){
            counter ++;

            if(counter==k-1){
                //we gotta insert here 

                //make a new node and point it to temp's next node
                Node toInsert = new Node(element);

                //connecting new node to next node first
                toInsert.next=temp.next;

                //now connecting current temp to new node
                temp.next=toInsert;


                break;
            }

            //move temp to next 
            temp=temp.next;
        }

        return head;

    }

    public static Node insertAtElementWhereValueK(Node head, int element, int k){

        //edge case (NOT POSSIBLE THOUGH BASED ON QUESTION)
        //if LL is empty
        if(head==null){
            return null;
        }

        //if, asked to be inserted before first index(new head)
        if(head.data==k){
            Node toAdd= new Node(element,head);
            return toAdd;
        }
 
        Node temp = head;

        while(temp.next!=null){
            

            if(temp.next.data==k){
                //we gotta insert here 

                //make a new node and point it to temp's next node
                Node toInsert = new Node(element); 

                //connecting new node to next node first
                toInsert.next=temp.next;

                //now connecting current temp to new node
                temp.next=toInsert;


                break;
            }

            //move temp to next 
            temp=temp.next;
        }

        return head;

    }




    public static void main(String[] args) {
        int[] arr = {12,4,7,2};
        Node head = convert2LL(arr);

        // //lets try and add 5 to LL in head position
        // head = addAtHead(head,5);
        // print(head);

        // //lets try to add 10 to LL in the Tail position
        // head = addAtTail(head, 10);
        // print(head);


        // lets try to insert a number at kth position
        print(head);
        head = insertAtElementWhereValueK(head, 100, 2);
        print(head); 
    }
    
}
