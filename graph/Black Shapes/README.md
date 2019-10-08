Black Shapes
Given N x M character matrix A of O's and X's, where O = white, X = black.
Return the number of black shapes. A black shape consists of one or more adjacent X's (diagonals not included) 
Input Format:
    The First and only argument is a N x M character matrix.
Output Format:
    Return a single integer denoting number of black shapes.
Constraints:
    1 <= N,M <= 1000
    A[i][j] = 'X' or 'O'
Example:
Input 1:
    A = [ OOOXOOO
          OOXXOXO
          OXOOOXO  ]
Output 1:
    3
Explanation:
    3 shapes are  :
    (i)    X
         X X
    (ii)
          X
    (iii)
          X
          X
Note: we are looking for connected shapes here.
XXX
XXX
XXX
