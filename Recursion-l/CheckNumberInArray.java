/*
Problem Statement :
Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
Do this recursively.

Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x

Output Format :
'true' or 'false
*/

//Driver Code :
import java.util.Scanner;
public class CheckNumberInArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scn.nextInt();
		}
		
		int x = scn.nextInt();
		System.out.println(checkNumber(arr,x));
		
	}
	
	public static boolean checkNumber(int[] arr, int x) {
			
			if(arr.length==0) {
				return false;
			}
			
			if(arr[0]==x) {
				return true;
			}
			
			int[] subarray = new int[arr.length - 1];
			
			for(int i=1; i<arr.length; i++) {
				subarray[i-1] = arr[i];
			}
			
			return checkNumber(subarray,x);
		}

}
