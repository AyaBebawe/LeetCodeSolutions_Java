/*
 * There are two-letter strings, "AA", "AB" and "BB", which appear AA, AB and BB times respectively. The task is to join some of these strings to create the longest possible string which does not contain "AAA" or "ввв"
For example, having AA = 5, AB = 0 and BB = 2, it is possible to join five strings by
taking both of the "BB" strings and three of the "AA" strings. Then they can be joined
into "AA-BB-AA-BB-ДА" → "дАвваавваа".
Note that it is not possible to add another "AA" string as the result would then contain
"AAA"
Write a function:
class solution ( public string solution(int AA, int AB, int BB); }
that, given three integers AA, AB and BB, returns the longest string that can be created according to the rules described above. If there is more than one possible answer, the function may return any of them.
Examples:
1 Given AA = 5, AB = 0 and BB = 2, the function should return AABBAABBAA, as
explained above.
2. Given AA = 1, AB = 2 and BB = 1, possible results are "BBABABAA, АВААВВАВ ABABAABB
Or AABBABAB
 */
public class Z_Stringconstraints {
	    public static String solution(int AA, int AB, int BB) {
	        StringBuilder result = new StringBuilder();

	        while (AA > 0 || BB > 0 || AB > 0) {
	            // Add BB if available and the last two characters are not "AB"
	            if (BB > 0 && !endsWithAB(result)) {
	                result.append("BB");
	                BB--;
	            }

	            // Add AB if available
	            else if (AB > 0 && !endsWithAA(result)) {
	                result.append("AB");
	                AB--;
	            }

	            // Add AA if available and the last two characters are not "AA"
	            else if (AA > 0 && !endsWithAA(result)) {
	                result.append("AA");
	                AA--;
	            }
	        }

	        return result.toString();
	    }

	    private static boolean endsWithAB(StringBuilder result) {
	        int len = result.length();
	        return len >= 2 && result.charAt(len - 2) == 'A' && result.charAt(len - 1) == 'B';
	    }

	    private static boolean endsWithAA(StringBuilder result) {
	        int len = result.length();
	        return len >= 2 && result.charAt(len - 2) == 'A' && result.charAt(len - 1) == 'A';
	    }
	    
	  
	    public static void main(String[] args) {
	        Solution solution = new Solution();

	        // Example 1
	        System.out.println(Z_Stringconstraints.solution(5, 0, 2)); // Output: AABBAABBAA

	        // Example 2
	        System.out.println(Z_Stringconstraints.solution(1, 2, 1)); // Output: Any valid result like BBABABAA, ABABAABB, AABBABAB
	    }
	


}
