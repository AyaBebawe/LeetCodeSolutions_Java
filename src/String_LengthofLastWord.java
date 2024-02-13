/*
 * Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal 
substring
 consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
 */


public class String_LengthofLastWord {
	 public int lengthOfLastWord(String s) {

	     
	     int wordsize =0;  
	   for (int i = s.length() - 1 ; i >= 0 ; i-- )
	    {
	        if (s.charAt(i) != ' ' )
	        {
	            wordsize ++ ;
	        }

	        else 
	        {
	            if (wordsize > 0)
	            {
	                return wordsize ;
	            }
	        }

	    }
	    return wordsize ;
	    }

}
