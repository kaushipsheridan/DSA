package LinkedLists;
public class deleteAllKeyOccurances {
    
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

    public static Node deleteAllKey(Node head, int key){

        //first lets remove the initial key elements until a non key 
        //head element is found
        Node newHead= head;

        while(newHead.data==key){
            newHead= newHead.next;
        }

       head = newHead;

       Node temp = head;
       Node mover = head.next;;

       while(mover.next!=null){
            //now considering mover can be at
            if(mover.data==key){
                mover=mover.next;
            }else{

                temp.next=mover;
                mover.prev= temp;
                
                //now moving mover and temp     
                temp = temp.next;
                mover = mover.next;
            }

            //handling tail logic
            if(mover.data==key){
                temp.next=null;
            }

       }

       return head;

    }

    public static void main(String[] args) {
         int[] arr = {10,10,1,10,4,10,10,6,10};
        Node head = convertToDLL(arr);
        int key = 10;
        head = deleteAllKey(head,key);

        print(head);
    }
    
}
