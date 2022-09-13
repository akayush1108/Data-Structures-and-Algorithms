/*
Problem Statement:  Diameter of Binary Tree (LeetCode-543)

Given the root of a binary tree, return the length of the diameter of the tree.
The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
The length of a path between two nodes is represented by the number of edges between them.

 
Example 1:
Input: root = [1,2,3,4,5]
Output: 3
Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].

Example 2:
Input: root = [1,2]
Output: 1

Constraints:
    The number of nodes in the tree is in the range [1, 104].
    -100 <= Node.val <= 100

*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root==null){
            return 0;
        }
    
        // maximum distance between two nodes of left hand side;
        int ld = diameterOfBinaryTree(root.left);

        // maximum distance between two nodes of right hand side;
        int rd = diameterOfBinaryTree(root.right);

        // maximum distance between left's deepest and right's deepest
        int f = height(root.left) + height(root.right) + 2;

        // maximum of these three ld, rd and f
        int dia = Math.max(f, Math.max(ld,rd));
        return dia;
    }
    
    public static int height(TreeNode node) {
        if (node == null) {
          return -1;
        }

        int lh = height(node.left);
        int rh = height(node.right);

        int th = Math.max(lh, rh) + 1;
        return th;
    }
}