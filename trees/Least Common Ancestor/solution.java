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
    private boolean check1 = false;
    private boolean check2 = false;
    public int lca(TreeNode A, int B, int C) {
        TreeNode node = null;
        verify(A,B,C);
        if(check1 && check2) {
            node = search(A,B,C);
        }
        return node==null?-1:node.val;
    }
    
    private TreeNode search(TreeNode node,int a,int b) {
        if(node == null) {
            return null;
        }
        if(node.val == a || node.val == b) {
            return node;
        }
        
        TreeNode left = search(node.left,a,b);
        TreeNode right = search(node.right,a,b);
        
        if(left != null && right != null) {
            return node;
        } else if(left == null && right != null) {
            return right;
        } else if(left != null && right == null) {
            return left;
        }
        return null;
    }
    
    private void verify(TreeNode node, int a, int b) {
        if(node == null) {
            return;
        }
        if(node.val == a) {
            check1 = true;
        }
        if(node.val == b) {
            check2 = true;
        }
        verify(node.left,a,b);
        verify(node.right,a,b);
    }
}

