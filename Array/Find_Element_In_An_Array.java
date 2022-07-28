/*
Problem Statement:
1.You are given a number n, representing the size of array a.
2.You are given n distinct numbers, representing elements of array a.
3. You are given another number d.
4. You are required to check if d number exists in the array a and at what index (0 based). If found print the index, otherwise print -1.

Input Format:
A number n
n1
n2
.. n number of elements
A number d

Output Format:
A number representing index at which d is found in array a and -1 if not found

Sample Input:
6
15
30
40
4
11
9
40

Sample Output:
2

 */

//Driver Code :
import java.util.*;
public class Find_Element_In_An_Array {

	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = scn.nextInt();
        }

        int data = scn.nextInt();

        System.out.println(index(arr, data));
    }

    public static int index(int[] arr, int data){

        for(int i=0; i<arr.length; i++){
            if(arr[i]==data){
                return i;
            }
        }
        return -1;
    }
}
