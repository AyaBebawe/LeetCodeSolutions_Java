/*
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.
Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
 */
public class String_ValidPalindrome {
	 public boolean isPalindrome(String s) {

	      String swpunctuation_lowercase = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
	      int length = swpunctuation_lowercase.length();

	      for (int i =0,m=length-1; i <= m ; i++ , m--)
	      {
	          if (swpunctuation_lowercase.charAt(i) != swpunctuation_lowercase.charAt(m))
	          {
	              return false;
	          }
	      }
	      return true ;
	 }
}
