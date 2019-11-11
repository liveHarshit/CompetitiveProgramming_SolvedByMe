public class Solution {
    public int nTriang(ArrayList<Integer> A) {
        Collections.sort(A);
        int count = 0;
        int mod = (int) Math.pow(10,9)+7;
        for(int i=A.size()-1; i>=1; i--) {
            int x = A.get(i);
            int j = 0;
            int k = i-1;
            while(j<k) {
                int y = A.get(j);
                int z = A.get(k);
                if(y+z>x) {
                    count = (count+k-j)%mod;
                    k--;
                } else {
                    j++;
                }
            }
            
        }
        return count;
    }
}

