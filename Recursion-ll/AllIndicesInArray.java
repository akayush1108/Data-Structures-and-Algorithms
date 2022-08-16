/*
Problem Statement :
Given an array of length N and integer x, you need to find all indices in an array and return it in a new array.
Do this recursively. Indexing in the array starts from 0.

Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x

Output Format :
print all indices or -1

*/

//Driver Code :
import java.util.*;
public class AllIndicesInArray {
	
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		int x = scn.nextInt();
		int[] iarr = allIndices(arr, x, 0, 0);
		if(iarr.length==0) {
			System.out.println("-1");
			return;
		}
		
		for(int i=0; i<iarr.length; i++) {
			System.out.println(iarr[i]);
		}
	}
	
	public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
		if(idx==arr.length) {
			return new int[fsf];
		}
		if(arr[idx]==x) {
			int[] iarr = allIndices(arr, x, idx +1, fsf +1);
			iarr[fsf]=idx;
			return iarr;
		}
		else {
			int[] iarr = allIndices(arr, x, idx +1,fsf );
			return iarr;
		}
	}
}
