/*
Problem Statement:
1. You are given a number n.
4. Find the fibonacci number of given number.


Sample Input
abxdxpx
4


Sample Output
3


 */

//Driver Code :

import java.util.*;
public class FibonacciNo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		System.out.println(fibo(n));
	}

	public static int fibo(int n) {
		// Or   if(n<=1) return n;
		if(n==1 || n==2) {
			return 1;
		}
		
		int fib1= fibo(n-1);
		int fib2=fibo(n-2);
		
		int output = fib1 + fib2;
		return output;
	}
}
