class Number {
    int num;
    int freq;
    Number(int num, int freq) {
        this.num = num;
        this.freq = freq;
    }
}

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        ArrayList<Number> list = new ArrayList<>();
        int prev = A.get(0);
        int freq = 1;
        for(int i=1; i<A.size(); i++) {
            if(A.get(i) == prev) {
                freq++;
            } else {
                list.add(new Number(prev,freq));
                freq = 1;
            }
            prev = A.get(i);
        }
        list.add(new Number(prev,freq));
        int count = 0;
        int i=0;
        int j=list.size()-1;
        while(j>i) {
            int sum = list.get(i).num + list.get(j).num;
            if(sum < B) {
                i++;
            } else if(sum > B) {
                j--;
            } else {
                count += list.get(i).freq*list.get(j).freq;
                i++;
            }
         }
         for(Number k: list) {
             if(k.num*2 == B && k.freq >=2) {
                 count += ((k.freq -1)*k.freq)/2;
             }
         }
         return count;
    }
    
}

