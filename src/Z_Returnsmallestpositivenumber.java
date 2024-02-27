/*
 * given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
For exarbple, given A = 11, 3, 6, 4, 1, 21, the function should retur 5.
Given A = 11, 2, 3), the function should return 4.
Given A = 1-1, -3), the function should return 1.
Write an efficient algorithm for the following assumptions:
• Nis an integer within the range [1..100,000);
• each element of array A is an integer within the range [-1,000,000.. 1,000,000).
 */
import java.util.Arrays;

public class Z_Returnsmallestpositivenumber {
    public static int solution(int[] A) {
        Arrays.sort(A);

        int smallestPositive = 1;

        for (int value : A) {
            if (value == smallestPositive) {
                smallestPositive++;
            } else if (value > smallestPositive) {
                return smallestPositive;
            }
        }

        return smallestPositive;
    }

    public static void main(String[] args) {
        int[] example1 = {11, 3, 6, 4, 1, 21};
        int result1 = solution(example1);
        System.out.println("Result 1: " + result1);

        int[] example2 = {11, 2, 3};
        int result2 = solution(example2);
        System.out.println("Result 2: " + result2);

        int[] example3 = {-1, -1, -3};
        int result3 = solution(example3);
        System.out.println("Result 3: " + result3);
    }
}

