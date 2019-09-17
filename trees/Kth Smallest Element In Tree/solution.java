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
    public int kthsmallest(TreeNode A, int B) {
        int count = 0;
        Stack<TreeNode> s = new Stack<TreeNode>();
        while(A != null || !s.isEmpty()) {
            if(A == null) {
                 TreeNode temp = s.pop();
                 count++;
                 if(count == B) {
                     return temp.val;
                 }
                 A = temp.right;
            } else {
                s.push(A);
                A = A.left;
            }
        }
        return -1;
    }
}

