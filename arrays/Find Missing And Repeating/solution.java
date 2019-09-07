
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
		    int a = n+1;
		    int b = n+1;
		    for(int i=0; i<n; i++) {
		        int temp = Integer.parseInt(line[i]);
		        if(arr[temp - 1] == 0) {
		            arr[temp - 1] = temp;
		        } else {
		            if(b > temp) b = temp;
		        }
		    }
		    for(int i=0; i<n; i++) {
		        if(arr[i] == 0 && a > i+1) {
		            a = i+1;
		        }
		    }
		    System.out.println(b + " " + a);
 		}
 		br.close();
	}
}
