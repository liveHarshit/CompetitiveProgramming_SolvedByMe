/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	public TreeNode sortedArrayToBST(final List<Integer> a) {
	    int n = a.size();
	    TreeNode node = constructTree(a,0,n-1);
	    return node;
	}
	
	private TreeNode constructTree(List<Integer> list, int l, int r) {
	    if(l > r) {
	        return null;
	    }
	    int mid = (l+r)/2;
	    TreeNode node = new TreeNode(list.get(mid));
	    
	    node.left = constructTree(list,l,mid-1);
	    node.right = constructTree(list,mid+1,r);
	    
	    return node;
	}
}

