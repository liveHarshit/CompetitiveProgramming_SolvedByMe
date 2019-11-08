public class Solution {
    public int solve(ArrayList<Integer> A) {
        int even = 0;
        int odd = 0;
        for(int num: A) {
            if(num%2 != 0) {
               odd++;
            } else {
                even++;
            }
        }
        return Math.min(odd,even);
    }
}

