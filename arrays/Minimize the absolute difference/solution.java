public class Solution {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        int i=0,j=0,k = 0;
        int min = Integer.MAX_VALUE;
        while(i<A.size() && j<B.size() && k<C.size()) {
            int m = Math.min(A.get(i),Math.min(B.get(j),C.get(k)));
            int temp = Math.max(A.get(i),Math.max(B.get(j),C.get(k))) - m;
            if(min > temp) {
                min = temp;
            }
            if(m == A.get(i)) {
                i++;
            } else if(m == B.get(j)) {
                j++;
            } else {
                k++;
            }
        }
        return min;
    }
}

