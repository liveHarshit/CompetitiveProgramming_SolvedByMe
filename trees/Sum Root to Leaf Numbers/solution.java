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
import java.math.BigInteger;
public class Solution {
    private ArrayList<String> list = new ArrayList<>();
    public int sumNumbers(TreeNode A) {
        String s = "";
        find(A,s);
        int sum = 0;
        for(String i: list) {
            BigInteger bigInt = new BigInteger(i);
            BigInteger num = new BigInteger("1003");
            int temp = bigInt.mod(num).intValue();
            sum = (sum + temp) % 1003;
        }
        return sum;
    }
    
    private void find(TreeNode node, String s) {
        if(node == null) {
            return;
        }
        s += node.val;
        if(node.left == null && node.right == null) {
            list.add(s);
        }
        find(node.left,s);
        find(node.right,s);
    }
}

