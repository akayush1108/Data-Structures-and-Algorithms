/*
Problem Statement :
Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
First index means, the index of first occurrence of x in the input array.
Do this recursively. Indexing in the array starts from 0.

Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x

Output Format :
first index or -1

*/

public class Solution 
{

	public static int firstIndex(int arr[], int x) 
    {

        return firstIndex(arr, x, 0);
	  }
    
    public static int firstIndex(int arr[], int x, int idx) 
    {
    	if(idx > arr.length - 1) 
        { 										
        	return -1;
    	}

    	if(arr[idx] == x) 
        { 
        	return idx;
    	} 

        return firstIndex(arr, x, idx + 1);
    }