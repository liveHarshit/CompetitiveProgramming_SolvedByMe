public class Solution {
    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> prev = new ArrayList<Integer>();
        for(int i=1; i<=A; i++) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(1);
            if(i == 2) {
                list.add(1);
            } else if(i>2) {
                for(int j=2; j<=i-1; j++) {
                    list.add(prev.get(j-1)+prev.get(j-2));
                }
                list.add(1);
            }
            results.add(list);
            prev = list;
        }
        return results;
    }
}

