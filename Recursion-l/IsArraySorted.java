/*
Problem Statement: Check if the array is sorted or not if sorted return true or else false.
 */

import java.util.Scanner;

public class IsArraySorted {
	// Driver code:
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		System.out.println(isSorted(arr));

	}
	
	public static boolean isSorted(int[] arr) {
		if(arr.length==1) {
			return true;
		}
		
		if(arr[0]>arr[1]) {
			return false;
		}
		
		int[] temp = new int[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			temp[i-1]=arr[i];
		}
		
		return isSorted(temp);
	}

}
