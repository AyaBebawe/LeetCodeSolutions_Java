/*
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false
 */
public class String_isSubsequent {

	public boolean isSubsequence(String s, String t) {
	       if (t.length() < s.length() )
	       {
	           return false ;
	       }
	       if(s.isEmpty())
	       {
	           return true;
	       }
	       int i =0 ;
	        for (int m =0 ; m < t.length() && i < s.length() ;m++ )
	        {
	            if (s.charAt(i)==t.charAt(m))
	            {
	                i++;
	            }
	        }
	        if (i == s.length())
	        {
	            return true;
	        }
	        return false ;
	    }
}
