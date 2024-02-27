/*
 * You are given an implementation of a function solution that, given a positive integer N, prints to standard output another integer, which was formed by reversing a decimal representation of N. The leading zeros of the resulting integer should not be printed by the function.
Examples:
1. Given N = 54321, the function should print 12345.
2. Given N = 10011, the function should print 11001.
3. Given N = 1, the function should print 1.
The attached code is still incorrect for some inputs. Despite the errors), the code may produce a correct answer for the example test cases. The goal of the exercise is to find and fix the bug(s) in the implementation. You can modify at most three lines.
Assume that!
• N is an integer within the range [1. 1,000,000,000].
 */
public class Z_printreverseNumber {
	public class Solution {
	    public static void solution(int N) {
	        while (N > 0) {
	            int digit = N % 10;
	            System.out.print(digit);
	            N /= 10;
	        }
	    }

	    public static void main(String[] args) {
	        // Example 1
	        solution(54321); // Output: 12345
	        System.out.println();

	        // Example 2
	        solution(10011); // Output: 11001
	        System.out.println();

	        // Example 3
	        solution(1); // Output: 1
	        System.out.println();
	    }
	}

}
