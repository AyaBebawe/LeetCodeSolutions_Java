import java.util.HashMap;
import java.util.Map;

public class Array_HashMap_containsDuplicate {
	 public boolean containsNearbyDuplicate(int[] nums, int k) {
	        
	      Map <Integer,Integer> map = new HashMap<Integer,Integer>();
	      boolean exist = false ;
	      for (int i =0 ; i < nums.length ;i++ )
	      {
	        if (map.containsKey(nums[i]))
	        {
	           if (Math.abs(map.get(nums[i]) - i ) <= k)
	           {   exist= true ;
	               return exist ;
	           }
	           else 
	           {
	               map.put(nums[i],i) ;
	           }
	        }
	        else 
	        {
	            map.put(nums[i],i) ;
	        }
	      }

	      return exist ;

	    }

}
