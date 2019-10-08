public class Solution {
    private boolean visited[][];
    private int n;
    private int m;
    private char arr[][];
    private int count = 0;
    
    public int black(String[] A) {
        n = A.length;
        m = A[0].length();
        arr = new char[n][m];
        visited = new boolean[n][m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                visited[i][j] = false;
            }
        }
        
        for(int i=0; i<n; i++) {
            arr[i] = A[i].toCharArray();
        }
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(arr[i][j] == 'X' && visited[i][j] == false) {
                    count++;
                    visitBFS(i,j);
                }
            }
        }
        
        return count;
    }
    
    private void visitBFS(int i, int j) {
        if(i<0 || j<0 || i>=n || j>=m || arr[i][j] == 'O' || visited[i][j]) {
            return;
        }
        visited[i][j] = true;
        
        visitBFS(i,j+1);
        visitBFS(i,j-1);
        visitBFS(i+1,j);
        visitBFS(i-1,j);
    }
}

