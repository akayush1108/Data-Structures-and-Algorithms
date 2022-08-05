/*
Problem Statement:
1. You are given an array(arr) of integers.
2. You have to sort the given array in increasing order using quick-sort.

Input Format:
An Integer n 
arr1
arr2..
n integers

Output Format:
Check the sample output.

Sample Input:
5
7 
-2 
4 
1 
3

Sample Output:
-2 1 3 4 7 

*/

//Driver Code :
import java.util.*;

public class QuickSort {
	
	public static void main(String[] args) throws Exception {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int[] arr = new int[n];
	    for (int i = 0; i < n; i++) {
	      arr[i] = scn.nextInt();
	    }
	    quickSort(arr, 0, arr.length - 1);
	    print(arr);
	}

	public static void quickSort(int[] arr, int lo, int hi) {
    
	    if(lo>=hi){
	        return;
	    }
	    int pi = partition(arr,lo,hi);
	    quickSort(arr,lo,pi-1);
	    quickSort(arr,pi+1,hi);
    
	}

	public static int partition(int[] arr, int lo, int hi) {
		int pivot = arr[lo];
		int smallNumCount = 0;
		for(int i=lo;i<=hi;i++) {
			if(arr[i] < pivot) {
				smallNumCount++;
			}
		}
		int temp= arr[lo + smallNumCount];
		arr[lo + smallNumCount] = arr[lo];
		arr[lo]= temp;
	    
	    int i = lo, j = hi;
	    while (i < j) {
	      if (arr[i] <= pivot) {
	    	  i++;
	      } else if(arr[j] >= pivot) {
	        j--;
	      }
	      else {
	    	  swap(arr,i,j);
	    	  i++;
	    	  j--;
	      }
	    }
	    return lo + smallNumCount;
	}

  // used for swapping ith and jth elements of array
	public static void swap(int[] arr, int i, int j) {
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}

	public static void print(int[] arr) {
	    for (int i = 0; i < arr.length; i++) {
	      System.out.print(arr[i] + " ");
	    }
	    System.out.println();
	}


}