/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
    public long merge(long arr[], int l, int m, int r) {
        long count = 0L;
        int n1 = m - l + 1;
        int n2 = r - m;
        
        long L[] = new long[n1];
        long R[] = new long[n2];
        
        for(int i=0; i<n1; i++) {
            L[i] = arr[l+i];
        }
        
        for(int i=0; i<n2; i++) {
            R[i] = arr[m+1+i];
        }
        
        int i = 0;
        int j = 0;
        int k = l;
        
        while(i<n1 && j<n2) {
            if(L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                count += (m+1) - (l+i);
                j++;
            }
            k++;
        }
        
        while(i<n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        
        while(j<n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
        return count;
    }
    
    public long sort(long arr[], int l, int r) {
        long count = 0L;
        if(l < r) {
            int m = (l+r)/2;
            count += sort(arr,l,m);
            count += sort(arr,m+1,r);
            count += merge(arr,l,m,r);
        }
        return count;
    }
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0) {
		    int n = Integer.parseInt(br.readLine().trim());
		    String line[] = br.readLine().trim().split(" ");
		    long arr[] = new long[n];
		    for(int i=0; i<n; i++) {
		        arr[i] = Long.parseLong(line[i]);
		    }
		    GFG gfg = new GFG();
		    long count = gfg.sort(arr,0,n-1);
		    System.out.println(count);
		}
		br.close();
	}

}
