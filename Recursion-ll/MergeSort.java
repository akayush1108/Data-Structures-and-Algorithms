/*
Problem Statement:
Given an array of integers nums, sort the array in ascending order.

Example 1:
Input: nums = [5,2,3,1]
Output: [1,2,3,5]

Example 2:
Input: nums = [5,1,1,2,0,0]
Output: [0,0,1,1,2,5]

Constraints:
    1 <= nums.length <= 5 * 104
    -5 * 104 <= nums[i] <= 5 * 104


*/
class Solution {

    public int[] sortArray(int[] nums) {
        int lo = 0;
		int hi = nums.length-1;
        
        int[] ans = mergeSort(nums,lo,hi);
        return ans;
    }

    public static int[] mergeSort(int[] arr,int lo, int hi){
        if(lo==hi) {
			int [] ba = new int[1];
			ba[0] = arr[lo];
			return ba;
		}
		int mid = (lo + hi) / 2;
		int[] b = mergeSort(arr,lo,mid);
		int[] c = mergeSort(arr,mid+1,hi);
		
		int[] fsa = merge(b,c);
		return fsa;
    }
    
    public static int[] merge(int[] a, int[] b) {
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