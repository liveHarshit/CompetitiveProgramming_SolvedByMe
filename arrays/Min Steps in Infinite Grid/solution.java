public class Solution {
    
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        int x = 0;
        int y = 0;
        int count = 0;
        for(int i=0; i<n-1; i++) {
            x = Math.abs(A.get(i)-A.get(i+1));
            y = Math.abs(B.get(i) - B.get(i+1));
            count += Math.max(x,y);
        }
        return count;
    }
}

