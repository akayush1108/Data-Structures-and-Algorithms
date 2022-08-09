/*
 * Problem Statement :
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are given a number "tar".
4. calculate and print all subsets of given elements, the contents of which sum to "tar". 

Input Format :
A number n
n1
n2
.. n number of elements
A number tar

Output Format :
Comma separated elements of the subset, the contents of which add to "tar"
.. all such subsets, each in a single line (the elements of each subset should be comma separated)

Sample Input :
5
10
20
30
40
50
60

Sample Output :
10, 20, 30, .
10, 50, .
20, 40, .

 */

import java.util.*;
public class TargetSumSubsets {

	public static void main(String[] args) throws Exception {
		Scanner scn  = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		int tar = scn.nextInt();
		printTargetSumSubsets(arr,0,"",0,tar);
	}
	
	public static void printTargetSumSubsets(int[] arr, int idx, String set,int sos, int tar) {
		if(idx==arr.length) {
			if(sos==tar) {
				System.out.println( set );
			}
			return;
		}
		
		printTargetSumSubsets(arr,idx + 1, set + arr[idx] + " ",sos + arr[idx], tar);
		printTargetSumSubsets(arr,idx + 1, set,sos, tar);
	}
}
