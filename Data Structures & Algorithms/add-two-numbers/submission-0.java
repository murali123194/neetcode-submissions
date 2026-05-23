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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int counter=0;
        ListNode dummy=new ListNode(0);
        ListNode head=dummy;
        while(l1!=null&&l2!=null){
            int sum=l1.val+l2.val;
            if(sum+counter>9){
                sum=sum+counter;
                counter=1;
            }
            else{
                sum=sum+counter;
                counter=0;
            }
            dummy.next=new ListNode(sum%10);
            dummy=dummy.next;
            l1=l1.next;
            l2=l2.next;

            
            
        }
        while(l1!=null){
            int sum=l1.val;
            if(sum+counter>9){
                sum=sum+counter;
                counter=1;
            }else{
                sum=sum+counter;
                counter=0;

            }
            dummy.next=new ListNode(sum%10);
            dummy=dummy.next;
            l1=l1.next;
        }
        while(l2!=null){
            int sum=l2.val;
            if(sum+counter>9){
                sum=sum+counter;
                counter=1;
            }else{
                sum=sum+counter;
                counter=0;

            }
            dummy.next=new ListNode(sum%10);
            dummy=dummy.next;
            l2=l2.next;
        }
        if(counter==1){
            dummy.next=new ListNode(counter);
        }
        return head.next;
        
        
    }
}
