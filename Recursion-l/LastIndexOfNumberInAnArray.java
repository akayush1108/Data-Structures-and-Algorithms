/*
Problem Statement : 
Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array. Return -1 if it is not present in the array.
Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
You should start traversing your array from 0, not from (N - 1).
Do this recursively. Indexing in the array starts from 0.

Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x

Output Format :
last index or -1
*/

//Driver Code :
import java.util.*;
public class LastIndexOfNumberInArray {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		int x = scn.nextInt();
		int ans = LastIndex(arr,0,x);
		System.out.println(ans);
	}
	
	public static int LastIndex(int[] arr, int idx, int x) {
		if(idx==arr.length) {
			return -1;
		}
		
		int lidx = LastIndex(arr,idx+1,x);
		if(lidx==-1) {
			if(arr[idx]==x) {
				return idx;
			}
			else {
				return -1;
			}
		}
		else {
			return lidx;
		}
	}
	
	
}
