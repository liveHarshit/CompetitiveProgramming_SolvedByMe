public class Solution {
    public int cpFact(int A, int B) {
        while(gcd(A,B) != 1) {
            A = A/gcd(A,B);
        }
        return A;
    }
    
    private int gcd(int a, int b) {
        int x1 = Math.min(a,b);
        int x2 = Math.max(a,b);
        if(x2%x1 == 0) {
            return x1;
        } else {
            return gcd(x2%x1,x1);
        }
    }
}

