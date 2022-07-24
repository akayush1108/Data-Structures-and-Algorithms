/*
Problem Statement: 
You are given an array of size n and index idx.
Rotate the given array by idx element(towards the left).

Input:
7
2 6 3 1 5 9 8
2

Output:
3 1 5 9 8 2 6 

 */

import java.util.Scanner;

class Solution{
	public static int[] rotateArray(int[] arr,int n) {
		
		int[] temp = new int[n];
		
		for(int i=0;i<n;i++) {
			temp[i]=arr[i];
		}
		
		for(int i=n;i<arr.length;i++) {
			arr[i-n]=arr[i];
		}
		
		for(int j=0,i=arr.length-n;i<arr.length;i++) {
			arr[i]=temp[j];
			j++;
		}
		return arr;
	}
}

// Driver code:
public class RotateArrayFromSpecificPosition {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int idx = scn.nextInt();
		int[] ans = Solution.rotateArray(arr,idx);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i] + " ");
		}
		
    }
}
