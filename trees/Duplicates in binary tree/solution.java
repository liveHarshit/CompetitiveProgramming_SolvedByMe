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
    private boolean hasDuplicate = false;
    private HashMap<Integer,ArrayList<TreeNode>> map = new HashMap<Integer,ArrayList<TreeNode>>();
    
    public int solve(TreeNode A) {
        check(A);
        return hasDuplicate?1:0;
    }
    
    private void check(TreeNode node) {
        if(node == null || hasDuplicate) {
            return;
        }
        if(node.left == null && node.right == null) {
            return;
        }
        if(map.containsKey(node.val)) {
            ArrayList<TreeNode> nodeList = map.get(node.val);
            for(TreeNode treeNode: nodeList) {
                hasDuplicate = true;
                verify(node,treeNode);
                if(hasDuplicate) {
                    break;
                }
            }
            if(hasDuplicate) {
                return;
            } else {
                nodeList.add(node);
                map.put(node.val,nodeList);
            }
        } else {
            ArrayList<TreeNode> nodeList = new ArrayList<TreeNode>();
            nodeList.add(node);
            map.put(node.val,nodeList);
        }
        check(node.left);
        check(node.right);
    }
    
    private void verify(TreeNode node1, TreeNode node2) {
        if(!hasDuplicate) {
            return;
        }
        if(node1 == null && node2 == null) {
            return;
        } else if((node1 != null && node2 == null) || (node1 == null && node2 != null)) {
            hasDuplicate = false;
            return;
        }
        if(node1.val != node2.val) {
            hasDuplicate = false;
            return; 
        }
        verify(node1.left,node2.left);
        verify(node1.right,node2.right);
    }
}

