
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
		    int n = Integer.parseInt(br.readLine());
		    String line[] = br.readLine().split(" ");
		    int arr[] = new int[n];
		    for(int i=0; i<n; i++) {
		        arr[i] = Integer.parseInt(line[i]);
		    }
		    StringBuffer bf = new StringBuffer();
		    for(int i=0; i<n/2; i++) {
		        bf.append(arr[n-1-i] + " ");
		        bf.append(arr[i]+ " ");
		    }
		    if(n%2 != 0) {
		        bf.append(arr[n/2]);
		    }
		    System.out.println(bf);
		}
	}
}
