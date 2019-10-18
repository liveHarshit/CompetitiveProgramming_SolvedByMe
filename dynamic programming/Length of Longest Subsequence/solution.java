public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int longestSubsequenceLength(final List<Integer> A) {
        int n = A.size();
        if(n == 0) {
            return 0;
        }
        int dp1[] = new int[n];
        int dp2[] = new int[n];
        dp1[0] = 1;
        dp2[n-1] = 1;
        
       for(int i=1; i<n; i++) {
           for(int j=i-1; j>=0; j--) {
               if(A.get(j) < A.get(i) && dp1[j] > dp1[i]) {
                   dp1[i] = dp1[j];
               }
           }
           dp1[i]++;
       }
       
       for(int i=n-2;i >= 0; i--) {
           for(int j=i+1; j<n; j++) {
               if(A.get(j) < A.get(i) && dp2[j] > dp2[i]) {
                   dp2[i] = dp2[j];
               }
           }
           dp2[i]++;
       }
        
        int max = 0;
        for(int i=0; i<n; i++) {
            int temp = dp1[i]+dp2[i]-1;
            if(temp > max) {
                max = temp;
            }
        }
        return max;
    }
}

