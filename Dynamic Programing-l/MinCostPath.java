/*
Problem Statement:
Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.
Note: You can only move either down or right at any point in time.

Example 1:
Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
Output: 7
Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.

Example 2:
Input: grid = [[1,2,3],[4,5,6]]
Output: 12


 */
import java.util.Scanner;
public class MinCostPath {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        System.out.println(minPathSum(arr));
	}
	
	public static int minPathSum(int[][] grid) {
        
		int n=grid.length;
        int m=grid[0].length;
        int[][] dp = new int[n][m];
        for(int i=dp.length-1;i>=0;i--){
            for(int j=dp[0].length-1;j>=0;j--){
            	// reached destination
                if(i==dp.length-1 && j==dp[0].length-1){
                    dp[i][j]=grid[i][j];
                }
                // row is at its extreme
                else if(i==dp.length-1){
                    dp[i][j]=dp[i][j+1] + grid[i][j];
                }
                // column is at its extreme
                else if(j==dp[0].length-1){
                    dp[i][j]=dp[i+1][j] + grid[i][j];
                }
                // rest of element
                else{
                    dp[i][j]=Math.min(dp[i+1][j],dp[i][j+1]) + grid[i][j]; 
                }
            }
        }
        return dp[0][0];
    }
}
