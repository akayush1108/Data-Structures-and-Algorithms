/*
Problem Statement:
1. You are given a two integer m and n.
2. You have to multiply it(m * n) using recursion.


Sample Input:
3
5

Sample Output:
15

*/

//Driver Code :
import java.util.*;
public class Multiplication {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		System.out.println(multiplyTwoIntegers(m,n));
	}
	
	public static int multiplyTwoIntegers(int m, int n) {
		if(n==0) {
			return 0;
		}
		
		int smallSum = multiplyTwoIntegers(m,n-1);
		int ans = smallSum + m;
		return ans;
	}
}
