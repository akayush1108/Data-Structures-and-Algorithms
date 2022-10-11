/*
Problem Statement: Kth Largest Element in an Array (LeetCode-215).

Given an integer array nums and an integer k, return the kth largest element in the array.
Note that it is the kth largest element in the sorted order, not the kth distinct element.
You must solve it in O(n) time complexity.


Example 1:
Input: nums = [3,2,1,5,6,4], k = 2
Output: 5

Example 2:
Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4


Constraints:
    1 <= k <= nums.length <= 105
    -104 <= nums[i] <= 104


 */
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargest {
	public static void main(String[] args) throws Exception {
	      Scanner scn = new Scanner(System.in);
	      int n = scn.nextInt();
	      int[] arr = new int[n];

	      for (int i = 0; i < n; i++) {
	         arr[i] = scn.nextInt();
	      }

	      int k = scn.nextInt();
	     
	      System.out.println(findKthLargest(arr,k));
	      //  3,2,3,1,2,4,5,5,6
	    }
	
	public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue <>(Collections.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
              pq.add(nums[i]);
        }
        while(pq.size()>nums.length-k+1){
            pq.remove();
        }
      
        return pq.peek();
    }
}
