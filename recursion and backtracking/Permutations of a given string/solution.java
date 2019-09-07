/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    private Set<String> set = new TreeSet<>();
    
    private String swap(String s, int a, int b) {
        char arr[] = s.toCharArray();
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return String.valueOf(arr);
    }
    
    private void printPremutations(String s, int l, int r) {
        if(l == r) {
            set.add(s);
        } else {
            for(int i=l; i<=r; i++) {
                s = swap(s,l,i);
                printPremutations(s,l+1,r);
                s = swap(s,i,l);
            }
        }
    }
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0) {
		    String s = br.readLine().trim();
		    GFG gfg = new GFG();
		    gfg.printPremutations(s,0,s.length()-1);
		    StringBuffer bf = new StringBuffer();
		    for(String str: gfg.set) {
		        bf.append(str+" ");
		    }
		    System.out.println(bf);
		}
		br.close();
	}
}
