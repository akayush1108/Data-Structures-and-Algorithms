/*
Problem Statement:
1. You are given a positive number n. 
2. You are required to print the counting from n to 1.
3. You are required to not use any loops. Complete the body of print Decreasing function to achieve it.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Input Format:
A number n

Output Format:
n
n - 1
n - 2
.. 
1

 */
import java.util.Scanner;

class Solution{
	public static void printDecreasing(int n) {
		if(n==0) {
			return;
		}
		
		System.out.println(n);
		printDecreasing(n-1);
	}
}

public class PrintDecreasing {

	public static void main(String[] arg) {
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		Solution.printDecreasing(n);
	}
}

