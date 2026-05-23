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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(0);
        ListNode head=dummy;
        ListNode l1=list1,l2=list2;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                dummy.next=new ListNode(l1.val);
                l1=l1.next;
            }
            else{
                dummy.next=new ListNode(l2.val);
                l2=l2.next;
            }
            dummy=dummy.next;
        }
        if(l1!=null){
            dummy.next=l1;
        }else{
            dummy.next=l2;
        }
        return head.next;
        
    }
}