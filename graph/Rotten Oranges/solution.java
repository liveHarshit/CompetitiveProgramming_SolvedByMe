class Data {
    int i;
    int j;
    Data(int i, int j) {
        this.i = i;
        this.j = j;
    }
}

public class Solution {
    private int count = 0;
    private Queue<Data> q = new LinkedList<>();
    public int solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        
        boolean flag = isAllRotted(A,n,m);
        
        while(!flag) {
            addQueue(A,n,m);
            boolean isRotted = doRotten(A,n,m);
            flag = isAllRotted(A,n,m);
            if(!flag && !isRotted) {
                return -1;
            }
        }
        
        return count;
        
    }
    
    private void addQueue(int[][] a, int n, int m) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                int temp = a[i][j];
                if(temp == 2) {
                    q.add(new Data(i,j));
                }
            }
        }
    }
    
    private boolean doRotten(int[][] a, int n, int m) {
        boolean counted = false;
        while(!q.isEmpty()) {
            Data d = q.remove();
            int i = d.i;
            int j = d.j;
            if(j>0 && a[i][j-1] == 1) {
                counted = true;
                a[i][j-1] = 2;
            }
            if(j<m-1 && a[i][j+1] == 1) {
                counted = true;
                a[i][j+1] = 2;
            }
            if(i>0 && a[i-1][j] == 1) {
                counted = true;
                a[i-1][j] = 2;
            }
            if(i<n-1 && a[i+1][j] == 1) {
                counted = true;
                a[i+1][j] = 2;
            }
        }
        if(counted) {
            count++;
        }
        return counted;
    }
    
    private boolean isAllRotted(int[][] arr, int n, int m) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(arr[i][j] == 1) {
                    return false;
                }
            }
        }
        return true;
    }
    
    
}

