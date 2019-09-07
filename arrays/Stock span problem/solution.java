
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
		    int n = Integer.parseInt(br.readLine());
		    String line[] = br.readLine().split(" ");
		    int arr[] = new int[n];
		    arr[0] = 1;
		    for(int i=1; i<n; i++) {
		        int count = 1;
		        for(int j=i-1; j>=0; j--) {
		            if(Integer.parseInt(line[j]) <= Integer.parseInt(line[i])) {
		                count++;
		            } else {
		                break;
		            }
		        }
		        arr[i] = count;
		    }
		    StringBuffer bf = new StringBuffer();
		    for(int i=0; i<n; i++) {
		        bf.append(arr[i] + " ");
		    }
		    System.out.println(bf);
		}
	}
}
