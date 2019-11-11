public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int l = 0;
        for(int r=0; r<A.size(); r++) {
            sum += A.get(r);
            while(sum > B) {
                sum -= A.get(l);
                l++;
            }
            if(sum == B) {
                for(int i=l; i<=r; i++) {
                    list.add(A.get(i));
                }
                return list;
            }
        }
        list.add(-1);
        return list;
    }
}

