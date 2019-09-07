/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public void change(int arr[][], int m, int n, int x, int y, int xy, int k) {
        arr[x][y] = k;
        
        if(y > 0 && arr[x][y-1] == xy) {
            change(arr,m,n,x,y-1,xy,k);
        }
        if (y < n-1 && arr[x][y+1] == xy) {
            change(arr,m,n,x,y+1,xy,k);
        }
        if(x > 0 && arr[x-1][y] == xy) {
            change(arr,m,n,x-1,y,xy,k);
        }
        if (x < m-1 && arr[x+1][y] == xy) {
            change(arr,m,n,x+1,y,xy,k);
        }
    }
    
    public void printArray(int arr[][], int m, int n) {
        StringBuffer bf = new StringBuffer();
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                bf.append(arr[i][j]+" ");
            }
        }
        System.out.println(bf);
    }
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0) {
		    String line[] = br.readLine().trim().split(" ");
		    int m = Integer.parseInt(line[0]);
		    int n = Integer.parseInt(line[1]);
		    String line2[] = br.readLine().trim().split(" ");
		    int arr[][] = new int[m][n];
		    int a = 0;
		    for(int i=0; i<m; i++) {
		        for(int j=0; j<n; j++) {
		            arr[i][j] = Integer.parseInt(line2[a]);
		            a++;
		        }
		    }
		    String line3[] = br.readLine().trim().split(" ");
		    int x = Integer.parseInt(line3[0]);
		    int y = Integer.parseInt(line3[1]);
		    int k = Integer.parseInt(line3[2]);
		    
		    GFG gfg = new GFG();
		    gfg.change(arr,m,n,x,y,arr[x][y],k);
		    gfg.printArray(arr,m,n);
		}
	}
}
