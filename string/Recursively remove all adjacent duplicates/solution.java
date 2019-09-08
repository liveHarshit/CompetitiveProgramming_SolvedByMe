/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    private boolean changed = true;
    private String sf;
    
    private void remove(String s) {
        int n = s.length();
        if(!changed || n<=1) {
            return;
        }
        StringBuffer bf = new StringBuffer();
        changed = false;
        if(s.charAt(0) != s.charAt(1)) {
            bf.append(s.charAt(0));
        } else {
            changed = true;
        }
        for(int i=1; i<n-1; i++) {
            if(s.charAt(i) != s.charAt(i-1) && s.charAt(i) != s.charAt(i+1)) {
                bf.append(s.charAt(i));
            } else {
                changed = true;
            }
        }
        if(s.charAt(n-1) != s.charAt(n-2)) {
            bf.append(s.charAt(n-1));
        } else {
            changed = true;
        }
        sf = bf.toString();
        remove(sf);
    }
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0) {
		    String s = br.readLine().trim();
		    GFG gfg = new GFG();
		    gfg.remove(s);
		    System.out.println(gfg.sf);
		    
		}
		br.close();
	}
}
