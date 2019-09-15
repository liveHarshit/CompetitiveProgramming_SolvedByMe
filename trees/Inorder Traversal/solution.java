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
    public int[] inorderTraversal(TreeNode A) {
        Stack<TreeNode> s = new Stack<TreeNode>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(A != null || !s.isEmpty()) {
            if(A == null) {
                TreeNode temp = s.pop();
                list.add(temp.val);
                A = temp.right;
            } else {
                s.push(A);
                A = A.left;
            }
        }
        
        int arr[] = new int[list.size()];
        int j = 0;
        for(int i:list) {
            arr[j] = i;
            j++;
        }
        return arr;
    }
}

