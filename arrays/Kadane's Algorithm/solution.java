/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0) {
		    int n = Integer.parseInt(br.readLine().trim());
		    String line[] = br.readLine().trim().split(" ");
		    int arr[] = new int[n];
		    for(int i=0; i<n; i++) {
		        arr[i] = Integer.parseInt(line[i]);
		    }
		    int temp = 0;
		    int max = Integer.MIN_VALUE;;
		    for(int i=0; i<n; i++) {
		        temp += arr[i];
		        if(temp > max) {
		            max = temp;
		        }
		        if(temp < 0) {
		            temp = 0;
		        }
		    }
		    System.out.println(max);
		}
		br.close();
	}
}
