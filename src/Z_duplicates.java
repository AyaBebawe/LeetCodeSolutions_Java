/*
 * Given an array of integers, find if the array contains any duplicates.
 *  Your function should return //true if any value appears 
 *  at least twice in the array, 
 * and it should return false if every element is distinct
 */
import java.util.HashSet;
import java.util.Set;

public class Z_duplicates {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueSet = new HashSet<>();

        for (int num : nums) {
            if (!uniqueSet.add(num)) {
                // If adding the element to the set fails (it's already present), return true.
                return true;
            }
        }

        // All elements are distinct if the loop completes without returning true.
        return false;
    }

    public static void main(String[] args) {
        int[] example1 = {1, 2, 3, 4, 5};
        System.out.println("Example 1: " + containsDuplicate(example1));

        int[] example2 = {1, 2, 3, 4, 1};
        System.out.println("Example 2: " + containsDuplicate(example2));
    }
}

