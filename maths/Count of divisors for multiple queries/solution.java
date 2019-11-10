public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:A) {
            list.add(count(i));
        }
        return list;
    }
    
    private int count(int num) {
        int val = (int) Math.floor(Math.sqrt(num));
        if(num == 1) {
            return 1;
        }
        int count = 2;
        for(int i=2; i<=val; i++) {
            if(num % i == 0) {
                count+=2;
            }
        }
        int c = (Math.sqrt(num) - val ==0)?1:0;
        return count-c;
    }
}

