/*
 * A string S consisting of the letters A, B, c and D is given. The string can be transformed either by removing a letter A together with an adjacent letter B, or by removing a letter c together with an adjacent letter D Write a function: class Solution { public string solution(String S); } that, given a string S consisting of N characters, returns any string that: • can be obtained from S by repeatedly applying the described transformation, and • cannot be further transformed. If at some point there is more than one possible way to transform the string, any of the valid transformations may be chosen. 
Examples:
1. Given S = "CBACD", , the function may return "C", because one of the possible sequences of operations is as follows CBACD -> CBA -> C .

 2. Given S = "CABABD" the function may return an empty string, because one possible sequence of operations is: 
CABABD -> CABD -> CD -> empty

3. Given string S = "ACBDACBD" the function should return 'ACBDACBD", because no operation can be applied to string s Write an efficient algorithm for the following assumptions.

 • the length of string $ is within the range (0.250,000]; 
• string S is made only of the following characters: 'A', 'B C'and/or D
 */
public class Z_String2 {
	public class Solution {
	    public String solution(String S) {
	      
	            StringBuilder newString = new StringBuilder();

	            for (int i = 0; i < S.length(); i++) {
	                char currentChar = S.charAt(i);

	                if (i < S.length() - 1) {
	                    char nextChar = S.charAt(i + 1);

	                    // Check for valid transformations: AB, BA, CD, DC
	                    if ((currentChar == 'A' && nextChar == 'B') || 
	                        (currentChar == 'B' && nextChar == 'A') ||
	                        (currentChar == 'C' && nextChar == 'D') ||
	                        (currentChar == 'D' && nextChar == 'C')) {
	                        i++; // Skip the next character
	                    } else {
	                        newString.append(currentChar);
	                    }
	                } else {
	                    newString.append(currentChar);
	                }
	            }

	            S = newString.toString();
	        

	        return S;
	    }

	  
	}

}
