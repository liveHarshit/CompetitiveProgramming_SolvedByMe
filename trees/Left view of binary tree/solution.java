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
    public ArrayList<Integer> solve(TreeNode A) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        TreeNode p =A;
        while(p!=null) {
            ar.add(p.val);
            if(p.left!=null) {
                p=p.left;
            } else {
                p=p.right;
            }
        }
        return ar;
    }
}

