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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode p=head;
        ListNode q=null;
        ListNode r=null;
        
        int size=calculateTheLength(head);
        int currentLength=0;
        int i=0;
        
		//For reversing the linkedlist
        while(p!=null && i<k){
            r=q;
            q=p;
            p=p.next;
            q.next=r;
            currentLength++;
            i++;
        }
		
        if(p!=null && size-currentLength>=k){
            head.next=reverseKGroup(p, k);
        }
		//When the size of the remaining linkedlist is smaller than the value of k
        else{
            head.next=p;
        }
            return q;
    }
    
    
    public int calculateTheLength(ListNode head){
        int size=0;
        while(head!=null){
            size++;
            head=head.next;
        }
        return size;
    }
}
