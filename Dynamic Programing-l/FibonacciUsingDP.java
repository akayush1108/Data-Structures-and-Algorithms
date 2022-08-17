/*
Problem Statement:
1. You are given a number n.
2. You are required to print the nth element of fibonacci sequence.

Sample Input:
10

Sample Output:
55

 */
import java.util.Scanner;
public class FibonacciUsingDP {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int fib = fibMemoized(n,new int[n + 1]);
		System.out.println(fib);
	}
	
	// Memoization method:
	public static int fibMemoized(int n, int[] dp) {
		// Or   if(n<=1) return n;
		if(n==0 || n==1) {
			return n;
		}
		
		if(dp[n] != 0) {
			return dp[n];
		}
		
		int fib1= fibMemoized(n-1,dp);
		int fib2=fibMemoized(n-2,dp);
		int fibn = fib1 + fib2;
		
		dp[n] = fibn;
		return fibn;
	}
}

