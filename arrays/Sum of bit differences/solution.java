/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0) {
		    int n = Integer.parseInt(br.readLine().trim());
		    String line[] = br.readLine().trim().split(" ");
		    int arr[] = new int[n];
		    for(int i=0; i<n; i++) {
		        arr[i] = Integer.parseInt(line[i]);
		    }
		    int sum = 0;
		    for(int i=0; i<n-1; i++) {
		        for(int j=i+1; j<n; j++) {
		            int x = arr[i]^arr[j];
		            String diff = Integer.toBinaryString(x);
		            for(int k=0; k<diff.length();k++) {
		                if(diff.charAt(k) == '1') {
		                    sum++;
		                }
		            }
		        }
		    }
		    System.out.println(sum*2);
		}
		br.close();
	}
}
