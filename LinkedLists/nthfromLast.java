package LinkedLists;

public class nthfromLast {

    //  public ListNode removeNthFromEnd(ListNode head, int n) {

    //     if (head == null) return null;

    //     // 1) Count the total length of the list
    //     int length = 0;
    //     ListNode temp = head;
    //     while (temp != null) {
    //         length++;
    //         temp = temp.next;
    //     }

    //     // 2) If the head itself needs to be removed
    //     if (n == length) {
    //         return head.next;
    //     }

    //     // 3) Find the (length - n)-th node (the one just before the target)
    //     int toDelete = length - n;
    //     ListNode curr = head;
    //     for (int i = 1; i < toDelete; i++) {
    //         curr = curr.next;
    //     }

    //     // 4) Delete the node
    //     curr.next = curr.next.next;

    //     return head;
    // }
    
}
