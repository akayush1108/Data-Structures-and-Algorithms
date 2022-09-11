/*
Problem Statement: All Nodes Distance K in Binary Tree (LeetCode-863)
Given the root of a binary tree, the value of a target node target, and an integer k, 
return an array of the values of all nodes that have a distance k from the target node.
You can return the answer in any order.
 
Example 1:
Input: root = [3,5,1,6,2,0,8,null,null,7,4], target = 5, k = 2
Output: [7,4,1]
Explanation: The nodes that are a distance 2 from the target node (with value 5) have values 7, 4, and 1.
Example 2:
Input: root = [1], target = 1, k = 3
Output: []
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        path = new ArrayList<>();  
        ans = new ArrayList<>();
	    find(root,target);         // it stores the path from node to root in terms of node
        
	    for(int i=0; i<path.size() && i<=k; i++) {
		    printKLevelsDown(path.get(i),k-i,i==0 ? null: path.get(i-1));  // for finding nodes at depth k
	    }
        
        return ans;
    }
    
    static List<Integer> ans;
    public static void printKLevelsDown(TreeNode node, int k,TreeNode blocker){
	    
	    if(node==null || k<0 || node == blocker){
	        return;
	    }
        
	    if(k==0){
	        ans.add(node.val);
            return;
	    }
        
	    printKLevelsDown(node.left,k-1,blocker);
	    printKLevelsDown(node.right,k-1,blocker);
	    
    }
    
    
    static ArrayList<TreeNode> path ;
    public static boolean find(TreeNode node, TreeNode data){
    
        if(node == null){
            return false;
        }

        if(node==data){
            path.add(node);
            return true;
        }

        boolean filc = find(node.left,data);
        if(filc){
            path.add(node);
            return true;
        }

        boolean firc = find(node.right,data);
        if(firc){
            path.add(node);
            return true;
        }

        return false;
    }
    
}