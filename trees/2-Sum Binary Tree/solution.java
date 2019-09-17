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
    public int t2Sum(TreeNode A, int B) {
        ArrayList<Integer> inorder = getInorder(A);
        int n = inorder.size();
        int i=0;
        int j=n-1;
        boolean flag = false;
        while(j>i) {
            int sum = inorder.get(i)+inorder.get(j);
            if(sum > B) {
                j--;
            } else if(sum < B) {
                i++;
            } else {
                flag = true;
                break;
            }
        }
        return flag?1:0;
    }
    
    private ArrayList<Integer> getInorder(TreeNode node) {
        ArrayList<Integer> inorder = new ArrayList<>();
        Stack<TreeNode> s = new Stack<TreeNode>();
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
        return inorder;
    }
}

