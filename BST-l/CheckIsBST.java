/*
Problem Statement: Validate Binary Search Tree (LeetCode-98)

Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:
    The left subtree of a node contains only nodes with keys less than the node's key.
    The right subtree of a node contains only nodes with keys greater than the node's key.
    Both the left and right subtrees must also be binary search trees.

 

Example 1:
Input: root = [2,1,3]
Output: true

Example 2:
Input: root = [5,1,4,null,null,3,6]
Output: false
Explanation: The root node's value is 5 but its right child's value is 4.


Constraints:
    The number of nodes in the tree is in the range [1, 104].
    -231 <= Node.val <= 231 - 1

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
    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }
        
        Long leftSubtreeMax = max(root.left);
        if(root.val <= leftSubtreeMax){
            return false;
        }
        
        Long rightSubtreeMin = min(root.right);
        if(root.val >= rightSubtreeMin){
            return false;
        }
        
        boolean leftAns = isValidBST(root.left);
        boolean rightAns = isValidBST(root.right);
        
        return leftAns && rightAns;
        
    }
    
    public static long max(TreeNode root){
        if(root==null){
            return Long.MIN_VALUE;
        }
        
        Long leftMax = max(root.left);
        Long rightMax = max(root.right);
        
        Long largest = Math.max(root.val, Math.max(leftMax,rightMax));
        return largest;
    }
    
    public static long min(TreeNode root){
        if(root==null){
            return Long.MAX_VALUE;
        }
        
        Long leftMin = min(root.left);
        Long rightMin = min(root.right);
        
        Long smallest = Math.min(root.val, Math.min(leftMin,rightMin));
        return smallest;
    }
}