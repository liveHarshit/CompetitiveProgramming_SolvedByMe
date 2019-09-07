
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0 ) {
		    int n = Integer.parseInt(br.readLine().trim());
		    String line[] = br.readLine().trim().split(" ");
		    int arr[] = new int[n];
		    for(int i=0; i<n; i++) {
		        arr[i] = Integer.parseInt(line[i]);
		    }
		    Arrays.sort(arr);
		    int count = 0;
		    while(arr[n-1] != 0) {
		        for(int i=0; i<n; i++) {
		            if(arr[i] % 2 == 1 && arr[i] != 0) {
		                arr[i]--;
		                count++;
		            }
		        }
		        if(arr[n-1] != 0) {
		            for(int i=0; i<n; i++) {
		                arr[i] /= 2;
		            }
		            count++;
		        }
		    }
		    System.out.println(count);
		}
		br.close();
	}
}
