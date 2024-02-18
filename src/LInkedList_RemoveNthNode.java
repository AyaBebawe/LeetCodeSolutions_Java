/*
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.

Example 1:

Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
 */
public class LInkedList_RemoveNthNode {
	
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 
	class Solution {
		
		
		
		 public ListNode optimumsolution_removeNthFromEnd(ListNode head, int n) {
		        ListNode fast = head, slow = head;
		        for (int i = 0; i < n; i++) fast = fast.next;
		        if (fast == null) return head.next;
		        while (fast.next != null) {
		            fast = fast.next;
		            slow = slow.next;
		        }
		        slow.next = slow.next.next;
		        return head;
		    }
		 
		 
		 
		
	    public ListNode removeNthFromEnd(ListNode head, int n) {
	     int length = 0;
	     ListNode current = head;
	      ListNode newlist = new ListNode();
	      ListNode newlisthead = newlist;



	     while (current != null)   
	     {  length=length+1;
	         current = current.next;
	     }
	    
	    for (int i =0 ; i < length ; i++)
	     {
	        if (i==length-n )
	         {
	            newlist.next = head.next;
	          return newlisthead.next;
	         }
	        else 
	         {
	         newlist.next=head;
	         }
	         head = head.next ;
	         newlist = newlist.next;
	     }
	    
	      
	     return newlisthead.next;
	    }
	}
	
}
