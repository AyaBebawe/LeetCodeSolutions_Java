/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */
public class Array_TwoSums {
	 public int[] twoSum(int[] nums, int target) {
	        
	        int[] indices = new int[2];
	     for (int i =0 ; i < nums.length -1 ; i++ )
	     {
	         for (int j = i +1 ; j < nums.length ; j++) 
	         {
	           if (nums[i] + nums [j] == target)
	           {
	             indices[0] = i ;
	             indices[1] = j ;
	             return indices ;
	           }
	            
	         }

	     }
	     return indices ;

	    }

}

// another solution by hashmap 

/*
 * class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{}; // No solution found
    }
}
 */



