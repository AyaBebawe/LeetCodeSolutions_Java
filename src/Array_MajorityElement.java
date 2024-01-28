/*
 * Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
Example 1:
Input: nums = [3,2,3]
Output: 3
Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */
import java.util.HashMap;
import java.util.Map;

public class Array_MajorityElement {
	 public int majorityElement(int[] nums) {

	        int majority_element =0; 
	        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	        for (int i = 0 ; i < nums.length ; i ++)
	        {
	            map.put(nums[i] , map.getOrDefault(nums[i],0) +1);

	        }
	        
	        for (  Map.Entry<Integer , Integer> entry : map.entrySet() )
	        {
	            if (entry.getValue() > nums.length / 2 )

	            {
	                majority_element = entry.getKey() ;
	            }

	        }
	      return majority_element ;

	    }
}
