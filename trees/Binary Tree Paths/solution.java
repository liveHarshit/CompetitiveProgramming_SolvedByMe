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
    ArrayList<ArrayList<Integer>> results = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> solve(TreeNode A) {
        ArrayList<Integer> list = new ArrayList<>();
        getPath(A,list);
        return results;
    }
    
    private void getPath(TreeNode A, ArrayList<Integer> list) {
        if(A == null) {
            return;
        }
        list.add(A.val);
        if(A.left == null && A.right == null) {
            results.add(new ArrayList<Integer>(list));
            return;
        }
        getPath(A.left,new ArrayList<Integer>(list));
        getPath(A.right,new ArrayList<Integer>(list));
    }
}

