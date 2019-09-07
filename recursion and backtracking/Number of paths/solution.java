/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    int count = 0;
    
    public int countPath(int m, int n) {
        if(m == 0 && n == 0) {
            count++;
        } else if(m == 0) {
            countPath(m,n-1);
        } else if (n == 0) {
             countPath(m-1,n);
        } else {
            countPath(m-1,n);
            countPath(m,n-1);
        }
        return count;
    }
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0) {
		    String line[] = br.readLine().trim().split(" ");
		    int m = Integer.parseInt(line[0]);
		    int n = Integer.parseInt(line[1]);
		    GFG gfg = new GFG();
		    System.out.println(gfg.countPath(m-1,n-1));
		}
		br.close();
	}

}
