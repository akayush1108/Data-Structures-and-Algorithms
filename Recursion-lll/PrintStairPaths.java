/*
Problem Statement:
You are given a number n representing number of stairs in a staircase.
You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
Complete the body of printStairPaths function - without changing signature - to print the list of all paths that can be used to climb the staircase up.
Use sample input and output to take idea about output.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Sample Input:
3

Sample Output:
111
12
21
3

 */
import java.util.Scanner;

public class PrintStairPaths {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		printPaths(n,"");
	}
	
	public static void printPaths(int n, String path) {
		if(n<0) {
			return;
		}
		if(n==0) {
			System.out.println(path);
			return;
		}
		
		printPaths(n-1,path + "1");
		printPaths(n-2,path + "2");
		printPaths(n-3,path + "3");
	}
}
