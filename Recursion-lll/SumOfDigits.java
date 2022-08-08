/*
Problem Statement:
1. You are given a number n.
2. You have to sum of all digits using recursion.


Sample Input:
12345

Sample Output:
15

*/

//Driver Code :
import java.util.*;
public class SumOfDigits {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(sumofDigits(n));
	}
	
	public static int sumofDigits(int n) {
		if(n==0) {
			return 0;
		}
		int smallSum = sumofDigits(n/10);
		int lastDigit = n % 10;
		int finalSum = smallSum + lastDigit;
		return finalSum;
	}
}
