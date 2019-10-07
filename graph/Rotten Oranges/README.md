Rotten Oranges
Given a matrix of integers A of size N x M consisting of 0, 1 or 2. Each cell can have three values:
The value 0 representing an empty cell.
The value 1 representing a fresh orange.
The value 2 representing a rotten orange.
Every minute, any fresh orange that is adjacent (Left, Right, Top, or Bottom) to a rotten orange becomes rotten. Return the minimum number of minutes that must elapse until no cell has a fresh orange.
If this is impossible, return -1 instead. Note:
Your solution will run on multiple test cases. If you are using global variables, make sure to clear them.

Input Format
The first argument given is the integer matrix A.
Output Format
Return the minimum number of minutes that must elapse until no cell has a fresh orange.  
If this is impossible, return -1 instead.
Constraints
1 <= N, M <= 1000
0 <= A[i] <= 2
For Example
Input 1:
    A = [   [2, 1, 1]
            [1, 1, 0]
            [0, 1, 1]   ]
Output 1:
    4

Input 2:
    A = [   [2, 1, 1]
            [0, 1, 1]
            [1, 0, 1]   ]
Output 2:
    -1
