public class Solution {
    private int count = 0;
    private ArrayList<Integer> result;
    public String getPermutation(int A, int B) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=1; i<=A; i++) {
            list.add(i);
        }
        findPremute(list,B,0);
        StringBuffer bf = new StringBuffer();
        for(int i: result){
            bf.append(i);
        }
        return bf.toString();
    }
    
    private void findPremute(ArrayList<Integer> list, int num, int index) {
        if(count > num) {
            return;
        }
        if(index == list.size() - 1) {
            count++;
            if(count == num) {
                result = new ArrayList<Integer>(list);
            }
        } else {
            for(int i=index; i<list.size(); i++) {
                swap(list,i,index);
                
                ArrayList<Integer> a = new ArrayList<Integer>();
                ArrayList<Integer> b = new ArrayList<Integer>();
                for(int j=0; j<list.size(); j++) {
                    if(j>index) {
                        b.add(list.get(j));
                    } else {
                        a.add(list.get(j));
                    }
                }
                Collections.sort(b);
                ArrayList<Integer> temp = new ArrayList<Integer>();
                temp.addAll(a);
                temp.addAll(b);
                
                findPremute(temp,num,index+1);
                swap(list,index,i);
            }
        }
    }
    
    private void swap(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
    }
}

