package LinkedLists;
public class removerDuplicatesFromDLL {

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

    public static Node removeAllDupes(Node head){


        Node temp = head;
        Node mover = head;

        while(mover !=null){

            if(mover.data==temp.data){
                mover=mover.next;
            }else{
                temp.next=mover;
                mover.prev=temp;

                //now updating mover and temp;
                temp=mover;
                mover=mover.next;
            }


        }

        //if mover found a num !=temp.data, then it would connect
        //but mover can reach null when it does find a lot of nums after temp that
        //are equal to temp -> therefore handling it by making temp.next=null;
        temp.next=null;

        return head;
    }


    public static void main(String[] args) {

        int[] arr = {1,1,1,2,2,3,4,5};
        Node head = convertToDLL(arr);

        head = removeAllDupes(head);

        print(head);


        
    }


}



