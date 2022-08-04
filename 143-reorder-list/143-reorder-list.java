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
        
        Stack<ListNode> st = new Stack<>();
        
        if(head.next == null) return;
        
        ListNode temp = head;
        
        int n = 0;
        
        while(temp!=null)
        {
            st.push(temp);
            temp  = temp.next;
            n++;
        }
        
        temp=head;
        
        for (int i=0; i<=n/2;i++)
        {
            ListNode str=temp.next;
            
            temp.next = st.peek();
            st.pop().next=str;
            
            temp=temp.next.next;
        }
        
        temp.next = null;
    }
}