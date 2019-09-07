Given an array with n distinct elements, convert the given array to a reduced form where all elements are in range from 0 to n-1. The order of elements is same, i.e., 0 is placed in place of smallest element, 1 is placed for second smallest element, … n-1 is placed for largest element.

Input:

The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is N, where N is the size of array.
The second line of each test case contains N input arr[i].

Output:

Print the reduced form of the array.

Constraints:

1 ≤ T ≤ 100
1 ≤ N ≤ 200
1 ≤ arr[i] ≤ 1000

Example:

Input:
2
3
10 40 20
5
5 10 40 30 20

Output:
0 2 1
0 1 4 3 2
