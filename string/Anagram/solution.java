/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0) {
		    String line[] = br.readLine().trim().split(" ");
		    String s1 = line[0];
		    String s2 = line[1];
		    if(s1.length() != s2.length()) {
		        System.out.println("NO");
		    } else {
		        int x = 0;
		        for(int i=0; i<s1.length(); i++) {
		            x = x ^ (int) s1.charAt(i);
		            x = x ^ (int) s2.charAt(i);
		        }
		        if(x == 0) {
		            System.out.println("YES");
		        } else {
		            System.out.println("NO");
		        }
		    }
		}
		br.close();
	}
}
