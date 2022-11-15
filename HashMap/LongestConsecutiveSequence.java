/*
Problem Statement: Longest Consecutive Sequence Of Elements

You are given a number n, representing the size of array a.
You are given n numbers, representing elements of array a.
You are required to print the longest sequence of consecutive elements in the array (ignoring duplicates).

Note -> In case there are two sequences of equal length (and they are also the longest), then print the one for which the starting point of which occurs first in the array.

Input Format
A number n
n1
n2
.. n number of elements

Output Format
Elements of longest sequence of consecutive elements of array in separate lines (ignoring duplicates).

Sample Input:
17
12 5 1 10 2 13 7 11 8 9 11 8 11 8 9 5 6 11


Sample Output:
5 6 7 8 9 10 11 12 13

 */
import java.util.HashMap;
import java.util.Scanner;

public class LongestConsecutiveSequence {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scn.nextInt();
		}
		
		longestSequence(arr);
	}
	
	public static void longestSequence(int[] arr) {
		
		HashMap<Integer,Boolean> map = new HashMap<>();
		
		for(int val: arr) {
			map.put(val, true);
		}
		
		for(int val: arr) {
			if(map.containsKey(val-1)) {
				map.put(val, false);
			}
		}
		
		int maxStartPoint = 0;
		int maxLength = 0;
		for(int val: arr) {
			if(map.get(val)==true) {
				int tempLength = 1;
				int tempStartPoint = val;
				
				while(map.containsKey(tempStartPoint + tempLength)) {
					tempLength++;
				}
				
				if(tempLength > maxLength) {
					maxStartPoint = tempStartPoint;
					maxLength = tempLength;
				}
			}
		}
		
		for(int i=0;i<maxLength;i++) {
			System.out.print(maxStartPoint + i + " ");
		}
	}
}
