public class Solution {
    public int solve(ArrayList<ArrayList<Integer>> A, int B) {
        int n = A.size();
        int m = A.get(0).size();
        boolean flag = false;
        int i=0;
        int j=m-1;
        while(i < n && j>=0) {
            int num = A.get(i).get(j);
            if(num == B) {
                flag = true;
                break;
            } else if(num < B) {
                i++;
            } else {
                j--;
            }
        }
        i++;
        j++;
        if(flag) {
            return ((i*1009)+j);
        } else {
            return -1;
        }
    }
}

