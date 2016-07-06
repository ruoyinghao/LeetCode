//find the maximum depth of a binary tree.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int depthLeft = maxDepth(root.left); 
        int depthRight = maxDepth(root.right);
        int depth = 0;
        if (depthLeft >= depthRight){  
            depth = depthLeft + 1;  
        }else{  
            depth = depthRight + 1;  
        }  
        return depth; 
        
    }
}
