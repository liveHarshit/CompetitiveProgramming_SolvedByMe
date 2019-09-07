
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
		    String line[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(line[0]);
		    int m = Integer.parseInt(line[1]);
		    int s = n+m;
		    double x = 1;
		    double y = 1;
		    int max = 0;
		    int min = 0;
		    if(n>=m) {
		        max = n;
		        min = m;
		    } else {
		        max = m;
		        min = n;
		    }
		    for(int i=s; i>max; i--) {
		        x *= i;
		    }
		    for(int i=min; i>0; i--) {
		        y *= i;
		    }
		    System.out.println(Math.round(x/y));
		}
		br.close();
	}
}
