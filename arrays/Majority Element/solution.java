public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int majorityElement(final List<Integer> A) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:A) {
            if(map.containsKey(i)) {
                map.put(i,map.get(i)+1);
            } else {
                map.put(i,1);
            }
        }
        int num = A.size()/2;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if(entry.getValue() > num) {
                return entry.getKey();
            }
        }
        return 0;
    }
}

