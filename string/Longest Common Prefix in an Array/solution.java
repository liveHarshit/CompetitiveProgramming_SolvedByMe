import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0) {
		    int n = Integer.parseInt(br.readLine().trim());
		    String arr[] = br.readLine().trim().split(" ");
		    String s = arr[0];
		    for(int i=1; i<n; i++) {
		        //System.out.println(s);
		        StringBuffer bf = new StringBuffer();
		        int n1 = s.length();
		        int n2 = arr[i].length();
		        int j = 0;
		        while(j<n1 && j<n2) {
		            char c = s.charAt(j);
		            if(c == (arr[i]).charAt(j)) {
		                bf.append(c);
		                j++;
		            } else {
		                break;
		            }
		        }
		        s = bf.toString();
		    }
		    if(s.isEmpty()) {
		        System.out.println(-1);
		    } else {
		        System.out.println(s);
		    }
		}
		br.close();
	}
}
