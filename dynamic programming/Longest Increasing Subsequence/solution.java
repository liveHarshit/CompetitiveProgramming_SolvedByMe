public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int lis(final List<Integer> A) {
        int n = A.size();
        int dp[] = new int[n];
        dp[0] = 1;
        for(int i=1; i<n; i++) {
            for(int j=i-1; j>=0; j--) {
                if(A.get(j) < A.get(i) && dp[j] > dp[i]) {
                    dp[i] = dp[j];
                }
            }
            dp[i]++;
        }
        int max = 0;
        for(int i=0; i<n; i++) {
            if(dp[i] > max) {
                max = dp[i];
            }
        }
        return max;
    }
}

