public class Solution {
    public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        long sum = Integer.MIN_VALUE;
        long localSum = 0;
        int l = 0;
        int r = 0;
        int i = 0;
        int pos = 0;
        boolean flag = true;
        for(int num: A) {
            if(num >= 0) {
                localSum += num;
                if(flag) {
                    pos = i;
                    flag = false;
                }
            } else {
                if(!flag && localSum > sum) {
                    sum = localSum;
                    l = pos;
                    r = i-1;
                }
                flag = true;
                localSum = 0;
            }
         
            i++;
        }
        if(!flag && localSum>sum) {
            r = i-1;
            l = pos;
            sum = localSum;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(sum >= 0) {
            for(int j=l; j<=r ;j++) {
                list.add(A.get(j));
            }
        }
        
        return list;
    }
}

