// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */

// class Solution {
//     public ListNode reverseKGroup(ListNode head, int k) {
//         // Find the length;
//         // len-k;
//         // If it is k,then reverse the last k eleemts 
//         // else leave them alone 
//         ListNode curr=head;
//         int count=0;
//         ListNode nextElement=null;

//         while(curr!=null){
            
            
//             count++;
//             if(k==count){
//                 nextElement=curr.next;

//             }
//             curr=curr.next;

//         }
//         int remain=count-k;
//         curr=head;
//         ListNode prev=nextElement;
        
//         while(curr!=nextElement){
//             ListNode nextNode=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=nextNode;
//         }
//         head=prev;
    
//         if(remain<k){
//             head=prev;
//             return head;

//         }
        
//         else{
//             curr=nextElement;
//             ListNode prev1=null;
//             while(curr!=null){
//             ListNode nextNode=curr.next;
//             curr.next=prev1;
//             prev1=curr;
//             curr=nextNode;
//         }
//         curr=head;
//         while(curr.next!=nextElement){
//             curr=curr.next;
//         }
//         curr.next=prev1;
        
//         return head;
            

//         }

        
        
//     }
// }
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        int count = 0;

        // Step 1: Check if there are k nodes ahead
        while (curr != null && count < k) {
            curr = curr.next;
            count++;
        }

        if (count < k) return head;

        // Step 2: Reverse k nodes
        ListNode prev = null;
        curr = head;
        ListNode next = null;
        count = 0;

        while (count < k && curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        // Step 3: Connect reversed part to the next group
        head.next = reverseKGroup(curr, k);

        // Step 4: prev is new head of this group
        return prev;
    }
}

