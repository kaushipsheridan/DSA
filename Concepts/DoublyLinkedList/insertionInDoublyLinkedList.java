package Concepts.DoublyLinkedList;

public class insertionInDoublyLinkedList {

    public static class Node{
        int data;
        Node next;
        Node prev;

        //c0nstructors

        Node(int data1, Node next1, Node back1){
            this.data=data1;
            this.next=next1;
            this.prev=back1;
        }

        //empty constructor as well
        
        Node(int data1){
            this.data=data1;
            this.next=null;
            this.prev=null;
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


    //INSERSION OF A NODE before HEAD OF DLL
    public static Node insertNodebeforeHead(Node head){

        Node temp= new Node(100,head,null);
        if(head!=null){
            head.prev=temp;
        }
        return temp;    
    }

    //INSERTION OF NODE BEFORE THE TAIL OF A DLL
    public static Node insertNodeBeforeTailDLL(Node head){

        //if DLL is null or just one element is present 
        if(head==null || head.next==null){

        }

        Node tail = head;
        while(tail.next!=null){
            tail=tail.next;
        }

        Node beforetail= tail.prev;

        //now we gotta insert the element btw beforeTail and Tail

        //setting node and its prev and next
        Node toInsert= new Node(55,tail,beforetail);

        //gotta change before tail's next and tails prev too
        beforetail.next=toInsert;
        tail.prev=toInsert;

        return head;
    }


    //








    public static void main(String[] args) {

        int[] arr = {3,5,7,4,84};
        Node head = convertToDLL(arr);

        head = insertNodeBeforeTailDLL(head);
        
        print(head);
        
    }
}
