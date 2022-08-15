/*
Problem Statement:

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
        
        System.out.println(minCostPath(arr));
	}
	
	// helper function
	public static int minCostPath(int[][] cost) {
		return minCost(cost,cost.length,cost[0].length,0,0);
	}
	
	public static int minCost(int[][] cost,int m, int n,int i,int j) {
		
		// reached destination
		if(i==m-1 && j==n-1) {
			return cost[i][j];
		}
		// base case
		// index out of bounds
		if(i>=m || j>=n) {
			return Integer.MAX_VALUE;
		}
		
		int subAns1 = minCost(cost,m,n,i+1,j);
		int subAns2 = minCost(cost,m,n,i,j+1);
		int subAns3 = minCost(cost,m,n,i+1,j+1);
		int ans = cost[i][j] + Math.min(subAns1, Math.min(subAns2, subAns3));
		
		return ans;
	}
}
