Convert an arbitrary Binary Tree to a tree that holds Children Sum Property
Given an arbitrary binary tree, convert it to a binary tree that holds such property : ->For every node, data value must be equal to sum of data values in left and right children. ->Consider data value as 0 for NULL children. You can only increment data values in any node (You cannot change the structure of the tree and cannot decrement the value of any node). NOTE Your code will run on multiple test cases (<= 50) CONSTRAINTS 1 <= Number of Nodes <= 500 1 <= Value at Node <= 2000 SAMPLE INPUT
     5
   /  \
  2    10
 / \   / \
 1  5  5  5
SAMPLE OUTPUT
    16
   /  \
  6    10
 / \   / \
 1  5  5  5
