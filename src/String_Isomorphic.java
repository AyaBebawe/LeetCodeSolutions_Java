/*
 * Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be 
replaced to get t.

All occurrences of a character must be replaced 
with another character while preserving the order of characters. 
No two characters may map to the same character, 
but a character may map to itself.

Example 1:
Input: s = "egg", t = "add"
Output: true
Example 2:
Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true
 */

import java.util.HashMap;

public class String_Isomorphic {
	
	 public boolean isIsomorphic(String s, String t) {

	        int slength= s.length();
	        int tlength = t.length();
	        HashMap<Character,Character> map = new HashMap<>();

	        if (slength != tlength) return false ;
	        for(int i =0 ; i < slength ;i++)
	        {
	          if (!map.containsKey(t.charAt(i)))
	          {
	              if (map.containsValue(s.charAt(i))) return false ;

	              map.put (t.charAt(i),s.charAt(i));
	              
	          }
	          else 
	          {
	              if (map.get(t.charAt(i)) != s.charAt(i))
	              {
	                  return false;
	              }
	          }


	        }
	       return true ;
	        
	    }

}
