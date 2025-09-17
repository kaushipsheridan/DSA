package LinkedLists;

public class sortLinkedList {

    //  public ListNode findMiddle(ListNode head){

    //     ListNode slow = head;
    //     ListNode fast= head;

    //     while(fast.next!=null && fast.next.next!=null){
    //         slow=slow.next;
    //         fast=fast.next.next;
    //     }

    //     return slow;

    // }

    // public ListNode sortList(ListNode head) {

    //     if (head == null || head.next == null) {
    //         return head;
    //     }

    //     ListNode middle = findMiddle(head);

    //     ListNode leftHead = head;
    //     ListNode rightHead= middle.next;

    //     //also clearing the next for leftList 
    //     middle.next=null;


    //     //CALLING RECURSIVE MERGE FUNCTION
    //     leftHead=sortList(leftHead);
    //     rightHead=sortList(rightHead);

    //     //ONCE DONE, LETS MURGE UP NOW
    //     return mergeUp(leftHead, rightHead); 
    // }

    // public ListNode mergeUp(ListNode leftNode, ListNode rightNode){

    // //hanlding basic excepptions
    // if(leftNode==null){
    //     return rightNode;
    // }

    // if(rightNode==null){
    //     return leftNode;
    // }

    // //intiial node of the ans Linked List ( will return ans.next as head later)
    // ListNode ans = new ListNode(10);

    // ListNode temp = ans;

    // while(leftNode!=null && rightNode !=null ){

    //     if(leftNode.val<rightNode.val){
    //         //setting it as next of temp
    //         temp.next= leftNode;
    //         //updating temp position
    //         temp=leftNode;
    //         //updating leftHead position
    //         leftNode=leftNode.next;

    //     }else{
    //         //same here blah blah
    //         temp.next = rightNode;
    //         temp= rightNode;
    //         rightNode = rightNode.next;
    //     }
    // }
    //     //NOW MERGING LEFTOVERS OF THE leftNode and rightNode LinkedList
    //     while(leftNode!=null){
    //          //setting it as next of temp
    //         temp.next= leftNode;
    //         //updating temp position
    //         temp=leftNode;
    //         //updating leftHead position
    //         leftNode=leftNode.next;

    //     }

    //     while(rightNode!=null){

    //          //same here blah blah
    //         temp.next = rightNode;
    //         temp= rightNode;
    //         rightNode = rightNode.next;

    //     }

    // return ans.next;
    // }


    
}
