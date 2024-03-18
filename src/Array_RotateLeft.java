
import java.util.Arrays;
public class Array_RotateLeft {
	

	
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5};
	        int d = 2; // Number of positions to rotate to the left
	        rotateLeft(arr, d);
	        System.out.println(Arrays.toString(arr)); // Output: [3, 4, 5, 1, 2]
	    }

	    // Function to rotate the array to the left by d positions
	    private static void rotateLeft(int[] arr, int d) {
	        int n = arr.length;
	        // To handle the case when d is greater than n
	        d = d % n;
	        reverse(arr, 0, d - 1); // Reverse the first d elements
	        reverse(arr, d, n - 1); // Reverse the remaining elements
	        reverse(arr, 0, n - 1); // Reverse the entire array
	    }

	    // Function to reverse the elements of the array in the specified range
	    private static void reverse(int[] arr, int start, int end) {
	        while (start < end) {
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            start++;
	            end--;
	        }
	    }



}
