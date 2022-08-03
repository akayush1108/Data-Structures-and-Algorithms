import java.util.Scanner;

public class MaximumOfanArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]= scn.nextInt();
		}
		
		int max = MOA(arr,0);
		System.out.print(max);
	}
	
	public static int MOA(int[] arr, int idx) {
		if(idx==arr.length-1) {
			return arr[idx];
		}
		
		int temp = MOA(arr,idx+1);
		if(temp>arr[idx]) {
			return temp;
		}
		else {
			return arr[idx];
		}
	}
}
