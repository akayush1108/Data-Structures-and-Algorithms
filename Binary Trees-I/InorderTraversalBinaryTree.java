/*
Problem Statement: Binary Tree Inorder Traversal (LeetCode-94).

Given the root of a binary tree, return the inorder traversal of its nodes' values. 

Example 1:
Input: root = [1,null,2,3]
Output: [1,3,2]

Example 2:
Input: root = []
Output: []

Example 3:
Input: root = [1]
Output: [1] 

Constraints:
    The number of nodes in the tree is in the range [0, 100].
    -100 <= Node.val <= 100

*/

class Solution {
    
    ArrayList<Integer> ans = new ArrayList<>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null){        // base case
            return ans;
        }
        
        inorderTraversal(root.left);
        ans.add(root.val);
        inorderTraversal(root.right);
        
        return ans;
    }
}