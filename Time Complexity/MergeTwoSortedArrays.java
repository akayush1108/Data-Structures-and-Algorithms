/*
Problem Statement:
1. You are given two sorted arrays(a,b) of integers.
2. You have to merge them and form one sorted array.
3. You have to do it in linear time complexity.

Input Format:
An Integer n 
a1
a2..n integers
An integer m
b1
b2..m integers

Output Format:
Check the sample output

Sample Input

4
-2 
5 
9 
11
3
4 
6 
8

Sample Output

-2
4
5
6
8
9
11

*/

//Driver Code :
import java.util.*;
public class MergeTwoSortedArrays {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = scn.nextInt();
		}
		
		int m = scn.nextInt();
		int[] b = new int[m];
		for(int i=0;i<m;i++) {
			b[i] = scn.nextInt();
		}
		
		int[] ans = mergeTwoSortedArrays(a,b);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]);
		}
	}
	
	public static int[] mergeTwoSortedArrays(int[] a, int[] b) {
		int[] res = new int[a.length + b.length];
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<a.length && j<b.length) {
			if(a[i] <= b[j]) {
				res[k] =a[i];
				i++;
				k++;
			}
			else {
				res[k] = b[j];
				j++;
				k++;
			}
		}
		
		if(i<a.length) {
			while(i < a.length) {
				res[k] =a[i];
				i++;
				k++;
			}
		}
		
		if(j<b.length) {
			while(j < b.length) {
				res[k] =b[j];
				j++;
				k++;
			}
		}
		
		return res;
	}
	
}
