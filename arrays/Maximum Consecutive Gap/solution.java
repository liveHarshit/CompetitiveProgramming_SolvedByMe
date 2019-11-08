public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maximumGap(final List<Integer> A) {
        if(A.size() < 2) {
            return 0;
        }
        Collections.sort(A);
        int max = 0;
        for(int i=0; i<A.size()-1;i++) {
            int val = A.get(i+1) - A.get(i);
            if(val > max) {
                max = val;
            }
        }
        return max;
    }
}

