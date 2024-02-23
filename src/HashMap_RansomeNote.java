/*
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

 

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
 */

import java.util.HashMap;

public class HashMap_RansomeNote {
	 public boolean canConstruct(String ransomNote, String magazine) {

	     if (magazine.length() < ransomNote.length())
	     {
	         return false;
	     }
	      HashMap <Character,Integer> map = new HashMap<>();
	      
	      for (int i=0 ; i< magazine.length() ; i ++)
	      {
	          map.put(magazine.charAt(i) , map.getOrDefault(magazine.charAt(i),0)+1);
	      }

	       for (int j =0 ; j < ransomNote.length() ; j++)
	       {
	           if (!(map.containsKey(ransomNote.charAt(j))) || map.get(ransomNote.charAt(j))<=0    )
	           {
	             return false; 
	           }
	           else 
	           {
	          map.put(ransomNote.charAt(j) , map.get(ransomNote.charAt(j))-1);
	           }
	       }

	    return true ;


	        
	    }
}
