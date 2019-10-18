public class Solution {
    public int jump(ArrayList<Integer> A) {
        int n = A.size();
        int dp[] = new int[n];
        for(int i=1; i<n; i++) {
            int jump = 0;
            dp[i] = Integer.MAX_VALUE-1;
            for(int j=i-1;j>=0; j--) {
                jump = i-j;
                if(A.get(j) >= jump && dp[j] < dp[i]) {
                    dp[i] = dp[j];
                }
            }
            dp[i]++;
        }
        return dp[n-1]==Integer.MAX_VALUE?-1:dp[n-1];
    }
}

