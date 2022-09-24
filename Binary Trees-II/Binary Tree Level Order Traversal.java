/*
Problem Statement: Binary Tree Level Order Traversal (LeetCode).

Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
 
Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]

Example 2:
Input: root = [1]
Output: [[1]]

Example 3:
Input: root = []
Output: []

Constraints:
    The number of nodes in the tree is in the range [0, 2000].
    -1000 <= Node.val <= 1000

*/
class Solution {
    
    ArrayList<List<Integer>> ans = new ArrayList<>();
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        if( root == null)
            return ans;
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        
        while(queue.size()>0){
            int count = queue.size();
            ArrayList<Integer> temp = new ArrayList<>();
			
            for(int i=0; i<count; i++){
                root=queue.remove();
                temp.add(root.val);
                
                if(root.left != null){
                    queue.add(root.left);
                }
                if(root.right != null){
                    queue.add(root.right);
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}