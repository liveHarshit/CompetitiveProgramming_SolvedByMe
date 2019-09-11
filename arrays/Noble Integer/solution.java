public class Solution {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A, Collections.reverseOrder());
        int n = A.size();
        for(int i=0; i<n; i++) {
            int j = i;
            int k = i-1;
            while(k>=0 && A.get(k) == A.get(k+1)) {
                j--;
                k--;
            }
            if(j == A.get(i)) {
                return 1;
            }
        }
        
        return -1;
    }
}

