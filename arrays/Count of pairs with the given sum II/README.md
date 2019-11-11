Count of pairs with the given sum II
Given a sorted array of integers (not necessarily distinct) A and an integer B, find and return how many pair of integers ( A[i], A[j] ) such that i != j have sum equal to B. Since the number of such pairs can be very large, return number of such pairs modulo (109+7). 
Input Format
The first argument given is the integer array A.
The second argument given is integer B.
Output Format
Return the number of pairs for which sum is equal to B modulo (10^9+7).
Constraints
1 <= length of the array <= 100000
1 <= A[i] <= 10^9 
1 <= B <= 10^9
For Example
Input 1:
    A = [1, 1, 1, 2, 3]
    B = 4
Output 1:
    3

Input 2:
    A = [1, 2, 2, 3, 4]
    B = 5
Output 2:
    3
