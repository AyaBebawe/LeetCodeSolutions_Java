/*
 * Given the head of a sorted linked list,
 *  delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.
Example 1:
Input: head = [1,2,3,3,4,4,5]
Output: [1,2,5]
 */

public class LinkedList_RemoveDuplicates {

	
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 
	class Solution {
	    public ListNode deleteDuplicates(ListNode head) {
	        ListNode current = head ;
	        ListNode newList = new ListNode();
	        ListNode newlistHead = newList ;
	        int duplicatedValue= 0;

	        while (current != null)
	        {
	          if( current.next != null && current.val == current.next.val)
	          {   
	             duplicatedValue = current.val;
	                while (current != null && current.val == duplicatedValue) {
	                    current = current.next;
	                }
	            
	          }  
	          else 
	          {
	          newList.next = current ;
	          current = current.next ;
	          newList= newList.next ;
	          }
	        }
	      newList.next = null;
	      return newlistHead.next;
	        
	    }
	}
	
	
}
