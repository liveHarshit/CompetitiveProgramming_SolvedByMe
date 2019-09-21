public class SolutionA {
    private ArrayList<ArrayList<Integer>> results = new ArrayList<>();
    
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.sort(A);
        findSubsets(list,A,0);
        return results;
    }
    
    private void findSubsets(ArrayList<Integer> temp, ArrayList<Integer> list, int index) {
        results.add(new ArrayList<Integer>(temp));
        
        for(int i=index; i< list.size(); i++) {
            temp.add(list.get(i));
            findSubsets(temp,list,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
