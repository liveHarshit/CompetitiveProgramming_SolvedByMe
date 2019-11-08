public class Solution {
	public void setZeroes(ArrayList<ArrayList<Integer>> a) {
	    Set<Integer> rSet = new HashSet<>();
	    Set<Integer> cSet = new HashSet<>();
	    int n = a.size();
	    int m = a.get(0).size();
	    for(int i=0; i<n; i++) {
	        for(int j=0; j<m; j++) {
	            if(a.get(i).get(j) == 0) {
	                rSet.add(i);
	                cSet.add(j);
	            }
	        }
 	    }
 	    
 	    for(int i=0; i<n; i++) {
	        for(int j=0; j<m; j++) {
	            if(rSet.contains(i) || cSet.contains(j)) {
	                a.get(i).set(j,0);
	            }
	        }
 	    }
	}
}

