/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public TreeNode solve(TreeNode A) {
        convert(A);
        return A;
    }
    
    private void convert(TreeNode node) {
        int left = 0;
        int right = 0;
        int diff;
        if(node == null || (node.left == null && node.right == null)) {
            return;
        }
        
        convert(node.left);
        convert(node.right);
        
        if(node.left != null) {
            left = node.left.val;
        }
        if(node.right != null) {
            right = node.right.val;
        }
        
        diff = left + right - node.val;
        
        if(diff > 0) {
            node.val += diff;
        }
        
        if(diff < 0) {
            increment(node,-diff);
        }
    }
    
    private void increment(TreeNode node, int diff) {
        if(node.left != null) {
            node.left.val += diff;
            increment(node.left,diff);
        } else if (node.right != null) {
            node.right.val += diff;
            increment(node.right,diff);
        }
    }
}

