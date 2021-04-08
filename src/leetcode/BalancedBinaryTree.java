package leetcode;

public class BalancedBinaryTree {
	
    public boolean isBalanced(TreeNode root) {
    	return getLength(root) >= 0;
    }
    
    private int getLength(TreeNode root) {
    	if (root == null) {
    		return 0;
    	}
    	int leftLength = getLength(root.left);
    	int rightLength = getLength(root.right);
    	if (leftLength == -1 
    			|| rightLength == -1 
    			|| (Math.abs(leftLength - rightLength) > 1)) {
    		return -1;
    	} else {
    		return Math.max(leftLength, rightLength) + 1;
    	}
    }
    
}
