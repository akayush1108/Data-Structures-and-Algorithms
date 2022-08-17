/*
Problem Statement:
1. You are given a number n.
2. You are required to print the nth element of fibonacci sequence.

Sample Input:
10

Sample Output:
55

 */

// Tabulation method(Iterative DP):
import java.util.Scanner;
public class FibonacciUsingDP {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int fib = fibIterative(n,new int[n + 1]);
		System.out.println(fib);
	}

	public static int fibIterative(int n, int[] dp) {
		// Or   if(n<=1) return n;
		if(n==0 || n==1) {
			return n;
		}
		
		int[] dp = new int[n+1];
		dp[0]=0;
		dp[1]=1;
		
		for(int i=2;i<dp.length;i++){
			dp[i]= dp[i-1] + dp[1-2];
		}
		return dp[n];
	}
}

