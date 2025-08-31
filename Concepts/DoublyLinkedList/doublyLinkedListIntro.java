package Concepts.DoublyLinkedList;

public class doublyLinkedListIntro {

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



    public static void main(String[] args) {

        int[] arr = {3,5,7,4,84};
        Node head = convertToDLL(arr);

        print(head);
        
    }
    
}
