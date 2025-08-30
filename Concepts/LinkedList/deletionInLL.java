package Concepts.LinkedList;

public class deletionInLL {

    public static class Node{

        int data;
        Node next;

        //CONSTRUCTORS
        Node(int data1, Node next1){
            this.data=data1;
            this.next=next1;
        }

        //for last node
        Node(int data1){
            this.data=data1;
            this.next=null;
        }
    }





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




    //DELEATING HEAD OF LL
    public static Node removesHead(Node head){
        if (head==null) return head;
        head=head.next;
        return head;
    }






    //DELEATING TAIL OF LL
    public static Node removesTail(Node head){

        //if there is empty or only one element in LL(in thr case of 1 element, we remove that element and return null)
        if(head ==null || head.next==null){
            return null;
        }

        //if more than one element, then
        Node temp = head;

        //unless, next element's next pointer is null -> keep moving
        while(temp.next.next!=null){
            temp=temp.next;
        }

        //update temp's next pointer
        temp.next=null;

        return head;

    }





    //DELETE A POSITION OF LL (Delete Kth Item)

    public static Node deletekthElement(Node head, int k){

        //if list is empty, return null
        if(head==null) return null;

        //if k==1, we gotta remove head
        if(k==1){
            return head;
        }

        //if(k== somewhere in btw)
        int counter=1;
        Node temp = head;
        Node prev=null;

        while(temp!=null){

            //manage counter when its equal to k
            if(counter==k){
                prev.next=prev.next.next;
                break;
            }

            //updating prev
            prev=temp;

            //moving temp
            temp=temp.next;

             //increase counter ofc
            counter++;
        }
        return head;
    }





    //DELETE A VALUE OF LL (Delete Kth Item)

    public static Node deleteValue(Node head, int k){

        //if list is empty, return null
        if(head==null) return null;

        //if k==1, we gotta remove head
        if(head.data==k){
            return head;
        }

        //if(k== somewhere in btw)
        Node temp = head;
        Node prev=null;

        while(temp!=null){
            
            //manage counter when its equal to k
            if(temp.data==k){
                prev.next=prev.next.next;
                break;
            }

            //updating prev
            prev=temp;

            //moving temp
            temp=temp.next;

        }
        return head;
    }



    public static void main(String[] args) {

        int[] arr = {12,4,7,2};
        Node head = convert2LL(arr);

        //PRINTING LL
        print(head);

        //REMOVING HEAD and PRINTING
        // head=removesHead(head);
        // print(head);

        // head=removesTail(head);
        // print(head);

        head = deleteValue(head, 4);
        print(head);
    

    }
    
}
