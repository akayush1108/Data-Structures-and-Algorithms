import java.util.*;
public class BinarySearch {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scn.nextInt();
		}
		
		int x = scn.nextInt();
		int startIndex = 0;
		int endIndex = arr.length-1;
		System.out.println(binarySearch(arr,startIndex,endIndex,x));
	}
	
	public static int binarySearch(int[] arr, int startIndex, int endIndex, int x) {
		if(startIndex > endIndex) {
			return -1;
		}
		
		int midIndex = (startIndex + endIndex)/2;
		
		if(arr[midIndex]==x) {
			return midIndex;
		}
		else if(arr[midIndex] < x) {
			return binarySearch(arr,midIndex +1,endIndex,x);
		}
		else {
			return binarySearch(arr,startIndex,midIndex - 1,x);
		}
		
	}
	
}
