package Concepts.DoublyLinkedList;

public class reverseADoublyLIsnkedList {

    public static class Node{
        int data;
        Node prev;
        Node next;

        //constructors
        Node(int data1, Node prev1, Node next1){
            this.data=data1;
            this.prev=prev1;
            this.next=next1;
        }

        Node(int data1){
            this.data=data1;
            this.prev=null;
            this.next=null;
        }
    }

    public static Node convert2DLL(int[] arr){

        //make head
        Node head = new Node(arr[0]);

        Node mover = head;

        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i],mover,null);
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

    public static Node reverseDLL(Node head){
        
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = convert2DLL(arr);


        Node hehe = reverseDLL(head);
    

        print(hehe);
    }
    
}
