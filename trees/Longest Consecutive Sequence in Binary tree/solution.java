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
    private int ct = 1;
    public int solve(TreeNode A) {
        calculate(A,-1,1);
        return ct;
    }
    
    private void calculate(TreeNode node, int prev, int count) {
        if(node == null) {
            return;
        }
        if(node.val == prev+1) {
            count++;
        } else {
            count = 1;
        }
        if(count > ct) {
            ct = count;
        }
        calculate(node.left, node.val,count);
        calculate(node.right, node.val,count);
    }
}

