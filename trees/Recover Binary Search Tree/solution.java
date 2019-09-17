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
    ArrayList<Integer> inorder = new ArrayList<Integer>();
    public ArrayList<Integer> recoverTree(TreeNode A) {
        getInorder(A);
        int n = inorder.size();
        ArrayList<Integer> inv = new ArrayList<Integer>();
        int temp = 0;
        int count = 0;
        for(int i=0; i<n-1; i++) {
            int a = inorder.get(i);
            int b = inorder.get(i+1);
            if(b < a) {
                count++;
                temp = b;
                if(inv.size() == 0) {
                    inv.add(a);
                } else {
                    inv.add(b);
                }
            }
        }
        if(count == 1) {
            inv.add(temp);
        }
        Collections.sort(inv);
        return inv;
    }
    
    private Stack<TreeNode> s = new Stack<TreeNode>();
    private void getInorder(TreeNode node) {
        while(node != null || !s.isEmpty()) {
            if(node == null) {
                TreeNode temp = s.pop();
                inorder.add(temp.val);
                node = temp.right;
            } else {
                s.push(node);
                node = node.left;
            }
        }
    }
}

