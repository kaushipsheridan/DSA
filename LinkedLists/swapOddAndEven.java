package LinkedLists;

public class swapOddAndEven {

    //TC : O(n)  SC : O(1)

    // public ListNode oddEvenList(ListNode head) {


    //     if(head==null){
    //         return null;
    //     }

    //     if(head.next==null){
    //         return head;
    //     }

    //     ListNode odd = head;
    //     ListNode oddHead=head;
    //     ListNode even = head.next;
    //     ListNode evenHead=head.next;

    //     //making 2 chains, one for odds and one for evens
    //     while(even!=null && even.next!=null){

    //         odd.next= odd.next.next;
    //         odd=odd.next;

    //         even.next=even.next.next;
    //         even=even.next;
    //     }

    //     //once this is done, we gotta connect last node of odd to first node of even(evenHead)
    //     odd.next=evenHead;

    //     return oddHead;
        
    // }

    
    public static void main(String[] args) {
        
        
    }
}
