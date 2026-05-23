/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=0;
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            len++;
        }
        int no_of_traversal=len-n;
        if(no_of_traversal==0){
            head=head.next;
            return head;
        }
        int count=0;
         curr=head;

        while(count<no_of_traversal-1&&curr!=null){
            curr=curr.next;
            count++;

        }
        if(curr.next!=null){
            curr.next=curr.next.next;

        }
        else{
            return null;
        }
        return head;

    }
}
