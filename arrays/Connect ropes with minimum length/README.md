Connect ropes with minimum length
Given an array of integers A representing the length of ropes. You need to connect these ropes into one rope. The cost of connecting two ropes is equal to the sum of their lengths. You need to connect the ropes with minimum cost. Find and return the minimum cost to connect these ropes into one rope. 
Input Format
The only argument given is the integer array A.
Output Format
Return the minimum cost to connect these ropes into one rope.
Constraints
1 <= length of the array <= 100000
1 <= A[i] <= 10^3
For Example
Input 1:
    A = [1, 2, 3, 4, 5]
Output 1:
    33
Explanation 1:
    1 + 2 = 3
    3 + 3 = 6
    4 + 5 = 9
    6 + 9 = 15

    3 + 6 + 9 + 15 = 33

Input 2:
    A = [5, 17, 100, 11]
Output 2:
    182
Explanation 2:
    5 + 11 = 16
    16 + 17 = 33
    33 + 100 = 133

    16 + 33 + 133 = 182
