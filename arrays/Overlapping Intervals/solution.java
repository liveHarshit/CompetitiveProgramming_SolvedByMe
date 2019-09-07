/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0) {
		    TreeMap<Integer, Integer> map = new TreeMap<Integer,Integer>();
		    int n = Integer.parseInt(br.readLine().trim());
		    String line[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n*2; i++) {
		        int start = Integer.parseInt(line[i]);
		        int end = Integer.parseInt(line[++i]);
		        if((map.containsKey(start) && map.get(start)<end) || !map.containsKey(start)) {
		            map.put(start,end);
		        }
		    }
		    int start = 0;
		    int end = 0;
		    StringBuffer bf = new StringBuffer();
		    int i=0;
		    for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
		        if(i==0) {
		            start = entry.getKey();
		            end = entry.getValue();
		            bf.append(start+" ");
		        } else {
		            if(entry.getKey()>end) {
		                bf.append(end+" "+entry.getKey()+" ");
		            }
		            if(end<entry.getValue()) {
		                end = entry.getValue();
		            }
		        }
		        i++;
		    }
		    bf.append(end+" ");
		    System.out.println(bf);
		}
		br.close();
	}
}
