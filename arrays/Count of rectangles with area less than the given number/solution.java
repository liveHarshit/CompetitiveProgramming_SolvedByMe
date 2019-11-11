public class Solution {
    public long solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        int i = 0;
        int j = n-1;
        long count = 0;
        long mod = (long) Math.pow(10,9)+7;
        
        while(j>=i) {
            if(A.get(i)*A.get(j) >= B) {
                j--;
            } else {
                count += ((2*(j-i))%mod +1)%(mod);
                i++;
            }
        }
        return count%(mod);
    }
}
