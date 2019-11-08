public class Solution {
    public int solve(int A, ArrayList<Integer> B) {
        int n = B.size();
        int i=0;
        int sum = 0;
        while(sum < A) {
            sum+= B.get(i%n);
            i++;
        }
        return i%n==0?n:i%n;
    }
}

