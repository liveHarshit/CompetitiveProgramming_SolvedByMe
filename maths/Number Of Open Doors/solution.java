public class Solution {
    public int solve(int A) {
        int count = 1;
        for(int i=2; i<=A; i++) {
            double sqrt = Math.sqrt(i);
            if(sqrt - Math.floor(sqrt) == 0) {
                count++;
            }
        }
        return count;
    }
}

