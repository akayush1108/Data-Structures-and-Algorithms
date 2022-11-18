/*
Problem Statement: Print Common Elements 2.

You are given a number n1, representing the size of array a1.
You are given n1 numbers, representing elements of array a1.
You are given a number n2, representing the size of array a2.
You are given n2 numbers, representing elements of array a2.
You are required to find the intersection of a1 and a2. To get an idea check the example below:
 
if a1 -> 1 1 2 2 2 3 5
and a2 -> 1 1 1 2 2 4 5
intersection is -> 1 1 2 2 5

Note -> Don't assume the arrays to be sorted. Check out the question video.

Input Format:
A number n1
n1 number of elements line separated
A number n2
n2 number of elements line separated

Output Format:
All relevant elements of intersection in separate lines
The elements of intersection should be printed in order of their occurence in a2.

Sample Input:
7
1 1 2 2 2 3 5
7
1 1 1 2 2 4 5


Sample Output:
1 1 2 2 5 

Constraints:
	1 <= n1, n2 <= 100
	0 <= a1[i], a2[i] < 10
	Time complexity should be O(n)

 */
import java.util.HashMap;
import java.util.Scanner;

public class PrintCommonElements2 {
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
			if(map.containsKey(i) && map.get(i)>0) {
				System.out.print(i + " ");
				int oldFrequency = map.get(i);
				int newFrequency = oldFrequency - 1;
				map.put(i, newFrequency);
			}
		}
	}
}
