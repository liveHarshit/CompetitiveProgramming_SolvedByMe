public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B, int C) {
        int diff = Integer.MAX_VALUE;
        int ii=0,jj=0;
        int i=0,j=B.size()-1;
        while(i<A.size() && j>=0) {
            int temp = Math.abs(A.get(i)+B.get(j)-C);
            if(temp < diff) {
                diff = temp;
                ii = i;
                jj = j;
            }
            if(A.get(i)+B.get(j) >= C) {
                j--;
            } else {
                i++;
            } 
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(A.get(ii));
        result.add(B.get(jj));
        return result;
    }
}

