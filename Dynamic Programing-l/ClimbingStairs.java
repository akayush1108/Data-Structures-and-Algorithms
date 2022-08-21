/*
Problem Statement:
1. You are given a number n, representing the number of stairs in a staircase.
2. You are on the 0th step and are required to climb to the top.
3. In one move, you are allowed to climb 1, 2 or 3 stairs.
4. You are required to print the number of different paths via which you can climb to the top.

Sample Input:
3

Sample Output:
4
Explanation: There are four ways to climb to the top.
1. 1 step + 1 step + 1 step + 1 steps
2. 1 step + 2 steps
3. 2 steps + 1 step
4. 3 steps
 */

import java.util.Scanner;
public class ClimbingStairs {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		System.out.println(countPaths(n,new int[n+1]));
	}
	
	// Memoization method:
	public static int countPaths(int n,int[] dp) {
		if(n==0) {
			return 1;
		}
		if(n<0) {
			return 0;
		}
		if(dp[n]>0) {
			return dp[n];
		}
		
		int nm1=countPaths(n-1,dp);
		int nm2=countPaths(n-2,dp);
		int nm3=countPaths(n-3, dp);
		int cp = nm1 + nm2 + nm3;
		
		dp[n]=cp;
		return cp;
	}
}


/*

Tabulation Method (Iterative DP):

class Solution {
    public int climbStairs(int n) {
        
        int[] dp = new int[n+1];
        dp[0]=1;
        
        for(int i=1;i<=n;i++){
            if(i==1){
                dp[i]=dp[i-1];
            }
            else if(i==2){
                dp[i]=dp[i-1] + dp[i-2];    
            }
            else{
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[n];
        
   	}
}
 */
