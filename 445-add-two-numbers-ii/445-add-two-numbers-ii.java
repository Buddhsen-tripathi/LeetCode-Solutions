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
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        
        while(l1 != null)
        {
            st1.push(l1.val);
            l1 = l1.next;
        }
        
        while(l2 != null)
        {
            st2.push(l2.val);
            l2 = l2.next;
        }
        
        ListNode res = new ListNode();
        
        int carry = 0;
        
        ListNode temp = res;
        
        while(!(st1.isEmpty()) && !st2.isEmpty()){
            int sum = st1.pop()+st2.pop();
            if(carry !=0){sum+= carry; carry=0;}
            if(sum > 9) {carry = sum/10;sum = sum%10; }
            ListNode dum = new ListNode(sum);
            temp.next = dum;
            temp = temp.next;
        }
        
        if(!(st1.isEmpty())){ while(!(st1.isEmpty())){int sum = st1.pop();if(carry !=0){sum+= carry; carry=0;}if(sum > 9) {carry = sum/10;sum = sum%10; }ListNode dum = new ListNode(sum);
            temp.next = dum;
            temp = temp.next;} }
        else if(!(st2.isEmpty())){ while(!(st2.isEmpty())){int sum = st2.pop();if(carry !=0){sum+= carry; carry=0;}if(sum > 9) {carry = sum/10;sum = sum%10; }ListNode dum = new ListNode(sum);
            temp.next = dum;
            temp = temp.next;} }
        
        if((st1.isEmpty() && st2.isEmpty()) && carry !=0) {ListNode dum = new ListNode(carry);
            temp.next = dum;
            temp = temp.next;}
        
        return reverseList(res.next);
    }
    
    static ListNode reverseList(ListNode head) {
        ListNode dummy = null;
        while (head != null){
            ListNode temp = new ListNode(head.val);
            temp.next = dummy;
            dummy = temp;
            head = head.next;
        }
        return dummy;
    }
}