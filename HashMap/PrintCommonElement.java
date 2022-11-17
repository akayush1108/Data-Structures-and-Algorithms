/*
Problem Statement: Print Common Elements.

You are given a number n1, representing the size of array a1.
You are given n1 numbers, representing elements of array a1.
You are given a number n2, representing the size of array a2.
You are given n2 numbers, representing elements of array a2.
You are required to print all elements of a2 which are also present in a1 (in order of their occurence in a2). Make sure to not print duplicates (a2 may have same value present many times).

Input Format:
A number n1
n1 number of elements line separated
A number n2
n2 number of elements line separated

Output Format:
All relevant elements of a2 in separate lines (no duplicacy)

Sample Input:
7
1 1 2 2 2 3 5
7
1 1 1 2 2 4 5


Sample Output:
1
2
5

Constraints:
	1 <= n1, n2 <= 100
	0 <= a1[i], a2[i] < 10
	Time complexity should be O(n)

 */
import java.util.HashMap;
import java.util.Scanner;

public class PrintCommonElement {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int[] a1 = new int[n1];
		for(int i=0;i<a1.length;i++) {
			a1[i]=scn.nextInt();
		}
		
		int n2 = scn.nextInt();
		int[] a2 = new int[n2];
		for(int i=0;i<a2.length;i++) {
			a2[i]=scn.nextInt();
		}
		
		printCommon(a1,a2);
		
	}
	public static void printCommon(int[] a1,int[] a2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i:a1) {
			if(map.containsKey(i)) {
				int oldFrequency = map.get(i);
				int newFrequency = oldFrequency + 1;
				map.put(i, newFrequency);
			}
			else {
				map.put(i, 1);
			}
		}
		
		for(int i:a2) {
			if(map.containsKey(i)) {
				System.out.println(i);
				map.remove(i);
			}
		}
	}
}
