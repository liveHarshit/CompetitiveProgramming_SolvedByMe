
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
		    int n = Integer.parseInt(br.readLine());
		    String line[] = br.readLine().trim().split(" ");
		    TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
		    for(int i=0; i<n; i++) {
		        map.put(Integer.parseInt(line[i]),i);
		    }
		    int sol[] = new int[n];
		    int j = 0;
		    for(int i:map.keySet()) {
		        sol[map.get(i)] = j;
		        j++;
		    }
		    StringBuffer bf = new StringBuffer();
		    for(int i=0; i<n; i++) {
		        bf.append(sol[i] + " ");
		    }
		    System.out.println(bf);
		}
	}
}
