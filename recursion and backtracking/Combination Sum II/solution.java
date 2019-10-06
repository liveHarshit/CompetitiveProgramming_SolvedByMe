public class Solution {
    private ArrayList<ArrayList<Integer>> results = new ArrayList<>();
	public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b) {
	    Collections.sort(a);
	    ArrayList<Integer> temp = new ArrayList<Integer>();
	    findCombination(a, temp, 0, b);
	    return results;
	}
	
	private void findCombination(ArrayList<Integer> list, ArrayList<Integer> temp, int pos, int num) {
	    //System.out.println(temp);
	    int sum = 0;
	    for(int i: temp) {
	        sum += i;
	    }
	    if(sum == num) {
	       results.add(new ArrayList<Integer>(temp));
	    }
	    for(int i=pos; i<list.size(); i++) {
	        if(shouldAdd(list,pos,i)) {
	           temp.add(list.get(i));
	           findCombination(list,temp,i+1,num);
	           temp.remove(temp.size()-1);
	        }
	   }
	    
	}
	
	private boolean shouldAdd(ArrayList<Integer> list, int l, int r) {
	    for(int i=l; i<r; i++) {
	        if(list.get(i) == list.get(r)) {
	            return false;
	        }
	    }
	    return true;
	}
}

