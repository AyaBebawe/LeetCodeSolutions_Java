/*
 * Given two strings s and t, return true if t is an anagram of s,
 *  and false otherwise.

An Anagram is a word or phrase formed 
by rearranging the letters of a different word or phrase, 
typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 
 */


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class String_isAnagram {
	public boolean isAnagram_anothersolution(String s, String t) {
	
		char [] sarray= s.toCharArray();
		char[] tarray= t.toCharArray();
		Arrays.sort(sarray);
		Arrays.sort(tarray);
		
		return  Arrays.equals(sarray, tarray);
		
		
		
	}
	
	
	public boolean isAnagram(String s, String t) {

	    HashMap <Character, Integer > charmap = new HashMap<>();
	    if (s.length() != t.length())
	     {
	     return false ;
	     }
	     for (int i =0 ; i < s.length() ; i++ )
	     {
	       charmap.put(s.charAt(i),charmap.getOrDefault(s.charAt(i),0)+1);
	     }
	       for (int i =0 ; i < t.length() ; i++ )
	       {
	         if (!charmap.containsKey(t.charAt(i)))
	         {
	             return false;
	         }
	          charmap.put(t.charAt(i),charmap.get(t.charAt(i))-1);
	       }
	       
	       for (Map.Entry<Character, Integer > entry : charmap.entrySet())
	       {
	           if (entry.getValue()!=0)
	           return false ;
	       }
	       /*
	        for (int val : charmap.values()) {
	            if (val != 0) 
	                return false;
	        }
	        */

	    return true ;
	    }

}
