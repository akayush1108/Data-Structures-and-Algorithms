/*
Problem Statement:
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing the prices of a share on n days.
3. You are required to find the stock span for n days.
4. Stock span is defined as the number of days passed between the current day and the first day before today when price was higher than today.

e.g.
for the array [2 5 9 3 1 12 6 8 7]
span for 2 is 1
span for 5 is 2
span for 9 is 3
span for 3 is 1
span for 1 is 1
span for 12 is 6
span for 6 is 1
span for 8 is 2
span for 7 is 1

Sample Input:
9
2 5 9 3 1 12 6 8 7

Sample Output:
1
2
3
1
1
6
1
2
1

 */

import java.util.Stack;
import java.util.Scanner;

public class StockSpan {
	public static void main(String[] args) throws Exception {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int[] arr = new int[n];
	   
	    for(int i = 0; i < n; i++){
	    	arr[i] = scn.nextInt();
	    }

	    int[] ans = solve(arr);
	    for(int i=0; i<arr.length; i++) {
	    	System.out.println(ans[i]);
	    }
	    
	 }

	 public static int[] solve(int[] arr){
	   // write your code here
	   int[] span = new int[arr.length];
	   Stack<Integer> st = new Stack<>();
	   
	   st.push(0);
	   span[0]=1;     //span value for 1st element is always 1.
	   
	   for(int i=1; i<arr.length; i++){
	       while(st.size()>0 && arr[i]>arr[st.peek()]){
	           st.pop();
	       }
	       
	       if(st.size()==0){
	           span[i]=i+1;
	       }
	       else{
	           span[i]=i-st.peek();
	       }
	       
	       st.push(i);
	   }
	   
	   return span;
	 }

	
}
