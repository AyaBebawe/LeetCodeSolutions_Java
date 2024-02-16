/*
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.

 

Example 1:


Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
 */

import java.util.HashSet;

public class LinkedList_cycle {
	
	  class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }
	 
	public class Solution {
	    public boolean hasCycle(ListNode head) {

	       ListNode current = head ;
	       HashSet<ListNode> visitedlist = new HashSet<ListNode>();
	       while (current != null)
	       {
	           if (visitedlist.contains(current))
	           {
	               return true;
	           }
	           visitedlist.add(current);
	           current = current.next ;
	       }
	       return false ;
	        
	    }
	}
}
