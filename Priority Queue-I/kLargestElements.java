/*
Problem Statement: K Largest Elements

You are given a number n, representing the size of array a.
You are given n numbers, representing elements of array a.
You are given a number k.
You are required to find and print the k largest elements of array in increasing order.

Sample Input:
13
12 62 22 15 37 99 11 37 98 67 31 84 99

Sample Output:
84
98
99
99

Constraints:
	1 <= n <= 30
	0 <= n1, n2, .. n elements <= 100
	0 < k <= n

 */
import java.io.*;
import java.util.*;

public class kLargestElements {

   public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
         arr[i] = scn.nextInt();
      }

      int k = scn.nextInt();
      
      kLargest(arr,k);
      
    }
    
    public static void kLargest(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue <>();
        for (int i = 0; i < arr.length; i++) {
          if (i < k) {
            pq.add(arr[i]);
          } 
          else {
            if (arr[i] > pq.peek()) 
            {
              pq.remove();
              pq.add(arr[i]);
            }
          }
        }

        while (pq.size() > 0) {
          System.out.println(pq.remove());
        }
    }

}