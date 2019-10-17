public class Solution {
    public int climbStairs(int A) {
        if(A == 1) {
            return 1;
        }
        if(A == 2) {
            return 2;
        }
        int dp[] = new int[A];
        dp[0] = 1;
        dp[1] = 2;
        for(int i=2; i<A; i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[A-1];
    }
}

