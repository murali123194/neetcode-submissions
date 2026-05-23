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
    public void reorderList(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        Stack<ListNode> stack=new Stack<>();
        ListNode middleNode=slow;
        slow=slow.next;
        while(slow!=null){
            stack.push(slow);
            slow=slow.next;
        }
        middleNode.next=null;

        ListNode curr=head;
        while(!stack.empty()){
            ListNode newNode=stack.pop();
            newNode.next=curr.next;
            curr.next=newNode;
            curr=curr.next.next;
            
        }


        
    }
}
