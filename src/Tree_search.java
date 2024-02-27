/*
 * Binary search tree (BST) is a binary tree where 2 the value of each node
 *  is larger or equal to the 1 values in all the nodes in that node's left subtree 
 *   and is smaller than the values in all the nodes in that nodes right subtree.
 *    Write a function that, efficiently with respect to time used,
 *     checks if a given binary search tree contains a given value.
 *      For example, for the following tree:
 *       • ni (Value: 1, Left: null, Right: null) 
 *       • n2 (Value: 2, Left: n1, Right: n3)
 *        • n3 (Value: 3, Left: null, Right: null)

Call to contains (n2, 3) should return true 
since a tree with root at n2 contains number 3.
 */
public class Tree_search {
	public class TreeNode {
	    int value;
	    TreeNode left;
	    TreeNode right;

	    public TreeNode(int value) {
	        this.value = value;
	        this.left = null;
	        this.right = null;
	    }
	}

	public class BinarySearchTree {
	    public static boolean contains(TreeNode root, int target) {
	        // Base case: If the root is null, the target is not found
	        if (root == null) {
	            return false;
	        }

	        // Check if the target is equal to the value at the current node
	        if (target == root.value) {
	            return true;
	        }

	        // If the target is less than the current node's value, search in the left subtree
	        if (target < root.value) {
	            return contains(root.left, target);
	        }

	        // If the target is greater than the current node's value, search in the right subtree
	        return contains(root.right, target);
	    }

	    public static void main(String[] args) {
	        // Example tree creation
	      //  TreeNode n1 = new TreeNode(1);
	       // TreeNode n3 = new TreeNode(3);
	       // TreeNode n2 = new TreeNode(2);
	       // n2.left = n1;
	        //n2.right = n3;

	        // Calling contains method
	        //boolean result = contains(n2, 3);

	        // Displaying the result
	        //System.out.println("Contains 3: " + result);
	    }

	}
}
