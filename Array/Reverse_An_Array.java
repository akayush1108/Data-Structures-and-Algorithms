/*
Problem Statement:
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to reverse the contents of array a.

Input Format:
Input is managed for you

Output Format:
Output is managed for you

Sample Input:
5
1
2
3
4
5

Sample Output:
5 4 3 2 1

 */

import java.util.*;
public class Reverse_An_Array {

	public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < arr.length;i++){
            arr[i] = scn.nextInt();
        }
        reverse(arr);
        display(arr);
        

    }

    public static void display(int[] arr){
        for(int d=0;d<arr.length;d++){
            System.out.print(arr[d] + " ");
        }
    }


    public static void reverse(int[] arr){
        int i=0;
        int j= arr.length - 1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
}
