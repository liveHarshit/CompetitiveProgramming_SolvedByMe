
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0) {
		    String[] values = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(values[0]);
		    int k = Integer.parseInt(values[1]);
		    String[] line = br.readLine().trim().split(" ");
		    int arr[] = new int[n];
		    for(int i=0; i<n; i++) {
		        arr[i] = Integer.parseInt(line[i]);
		    }
		    StringBuffer bf = new StringBuffer();
		    for(int i=0; i<=(n-k); i++) {
		        int max = arr[i];
		        for(int j=i+1; j<i+k; j++) {
		            if(arr[j]>max) max = arr[j];
		        }
		        bf.append(max + " ");
		    }
		    System.out.println(bf);
		}
		br.close();
	}
}
