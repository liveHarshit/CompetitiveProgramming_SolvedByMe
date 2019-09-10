public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int n = A.size();
        int last = 1;
        boolean flag = true;
        for(int i=n-1; i>=1; i--) {
            if(A.get(i) == 9) {
                A.set(i,0);
            } else {
                A.set(i,A.get(i)+1);
                flag = false;
                break;
            }
        }
        if(flag) {
            if(A.get(0) == 9) {
            A.set(0,0);
            A.add(0,1);
        } else {
            A.set(0,A.get(0)+1);
        }
        }
        for(int i=0; i<A.size();) {
            if(A.get(i) == 0) {
                A.remove(i);
            } else {
                break;
            }
        }
        
        return A;
    }
}

