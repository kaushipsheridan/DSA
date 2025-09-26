package LinkedLists;

import java.util.ArrayList;
import java.util.List;

public class twoSumDLL {

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

    public static class Pair{
        int key1;
        int key2;

        Pair(int k1, int k2){
            this.key1=k1;
            this.key2=k2;
        }

        @Override
        public String toString() {
            return "(" + key1 + "," + key2 + ")";
        }

    }

    public static List<Pair> FindSum(Node head, int sum){

           List<Pair> result = new ArrayList<>();

           Node h= head;
           Node t=head;

           //setting tail at right position
           while(t.next!=null){
            t=t.next;
           }

           while(h!=null && t !=null && h.prev!=t){

            int currentSum = h.data+ t.data;

            if(currentSum<sum){
                h=h.next;
            }else if( currentSum>sum){
                t=t.prev;
            }else{
                result.add(new Pair(h.data, t.data));
                h=h.next;
                t=t.prev;
            }
           }


           return result;

    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,9};
        int sum = 5;
        Node head = convertToDLL(arr);

        List<Pair> pairs = FindSum(head, sum);

        System.out.println("Pairs with sum " + sum + ": " + pairs);
        
    }
    
}
