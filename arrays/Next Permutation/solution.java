public class Solution {
    public ArrayList<Integer> nextPermutation(ArrayList<Integer> A) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n = A.size();
        boolean flag = false;
        int pos1 = 0;
        for(int i=n-1; i>0; i--) {
            if(A.get(i-1) < A.get(i)) {
                pos1 = i-1;
                flag = true;
                break;
            }
        }
        if(flag) {
            int pos2 = 0;
            for(int i=n-1; i>pos1; i--) {
                if(A.get(i) > A.get(pos1)) {
                    pos2 = i;
                    break;
                }
            }
            int temp = A.get(pos1);
            A.set(pos1,A.get(pos2));
            A.set(pos2,temp);
            for(int i=0; i<=pos1; i++) {
                list.add(A.get(i));
            }
            for(int i=n-1; i>pos1; i--) {
                list.add(A.get(i));
            }
        } else {
            for(int i=n-1; i>=0; i--) {
                list.add(A.get(i));
            }
        }
        return list;
    }
}

