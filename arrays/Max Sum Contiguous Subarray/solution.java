public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int max = Integer.MIN_VALUE;
        int localMax = 0;
        for(int i:A) {
            localMax += i;
            if(max<localMax) {
                max = localMax;
            }
            if(localMax < 0) {
                localMax = 0;
            }
        }
        return max;
    }
}

