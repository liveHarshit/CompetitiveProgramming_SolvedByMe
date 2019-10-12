public class Solution {
    int cost = 0;
    public int solve(ArrayList<Integer> list) {
        Collections.sort(list);
        int cost = 0;
        while(list.size() > 2) {
            int temp = list.get(0) + list.get(1);
            list.remove(0);
            list.remove(0);
            boolean added = false;
            for(int j=0; j<list.size(); j++) {
                if(list.get(j)>=temp) {
                    list.add(j,temp);
                    added = true;
                    break;
                }
            }
            if(!added) {
                list.add(temp);
            }
            cost += temp;  
        }
        for(int i: list) {
            cost += i;
        }
        return cost;
        
    }
}

