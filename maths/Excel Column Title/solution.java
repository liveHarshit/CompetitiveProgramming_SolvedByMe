public class Solution {
    public String convertToTitle(int A) {
        StringBuilder bf = new StringBuilder();
        while(A>0) {
            bf.append((char)(((A-1)%26)+65));
            A = (A-1)/26;
        }
        return bf.reverse().toString();
    }
}

