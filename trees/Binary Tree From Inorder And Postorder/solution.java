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
    HashMap<Integer,Integer> map = new HashMap<>();
    int n = 0;
    public TreeNode buildTree(int[] A, int[] B) {
        n = A.length;
        for(int i=0; i<n; i++) {
            map.put(A[i],i);
        }
        return construct(B,0,n-1,0);
    }
    
    private TreeNode construct(int post[], int l, int r, int index) {
        if(l > r) {
            return null;
        }
        int current = post[index+r-l];
        TreeNode node = new TreeNode(current);
        if(l == r) {
            return node;
        }
        
        node.left = construct(post, l,map.get(current)-1,index);
        node.right = construct(post,map.get(current)+1,r,index+(map.get(current)-1)-l+1);
        
        return node;
    }
    
}

