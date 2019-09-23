Given a Binary Search Tree of size N, that may be unbalanced. Your task is to complete the function buildBalancedTree(), that convert the given BST into a balanced BST that has minimum possible height.

Examples :

Input:
       30
      /
     20
    /
   10
Output:
     20
   /   \
 10     30

Input:
         4
        /
       3
      /
     2
    /
   1
Output:
      3            3           2
    /  \         /  \        /  \
   1    4   OR  2    4  OR  1    3   OR ..
    \          /                   \
     2        1                     4 

Input:
The function takes a single argument as input, the reference pointer to the root of the Binary Search Tree.
There are T, test cases and for each test case the function will be called separately.

Output:
For each test case output will be the new height of the BST.

Constraints:
1<=T<=100
1<=N<=200

Example:
Input:
2
3
30 20 10
5
10 8 7 6 5
Output:
2
3
