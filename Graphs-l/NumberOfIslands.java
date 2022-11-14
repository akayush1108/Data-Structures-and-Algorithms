/*
Problem Statement: Number Of Islands

You are given a 2d array where 0's represent land and 1's represent water. 
Assume every cell is linked to it's north, east, west and south cell.
You are required to find and count the number of islands.

Sample Input:
8
8
0 0 1 1 1 1 1 1
0 0 1 1 1 1 1 1
1 1 1 1 1 1 1 0
1 1 0 0 0 1 1 0
1 1 1 1 0 1 1 0
1 1 1 1 0 1 1 0
1 1 1 1 1 1 1 0
1 1 1 1 1 1 1 0

Sample Output:
3

 */
import java.io.*;

public class NumberOfIslands {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	    int m = Integer.parseInt(br.readLine());
	    int n = Integer.parseInt(br.readLine());
	    int[][] arr = new int[m][n];
	
	    for (int i = 0; i < arr.length; i++) {
	    	String parts = br.readLine();
	    	for (int j = 0; j < arr[0].length; j++) {
	    		arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
	    	}
	    }
	
	    System.out.println(numIslands(arr));
  }
  
  public static int numIslands(int[][] arr) {
	  boolean[][]visited = new boolean[arr.length][arr[0].length]; //
	  int count = 0;
	  
	  for (int i = 0; i < arr.length; i++) {
	      for (int j = 0; j < arr[0].length; j++) {
	    	  if (arr[i][j] == 0 && visited[i][j] == false) {
	    		  drawTreeforComponent(arr, i, j, visited);
	    		  count++;
	    	  }
	      }
	   }
	   return count; 
  }

  private static void drawTreeforComponent(int[][] arr, int i, int j, boolean[][] visited) {
	  if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j] == 1 || visited[i][j] == true) { // base case
		  return;
	  }
	  
	  visited[i][j] = true; 
	  drawTreeforComponent(arr, i - 1, j, visited); // north neighbour
	  drawTreeforComponent(arr, i, j + 1, visited); // east neighbour
	  drawTreeforComponent(arr, i, j - 1, visited); // west neighbour
	  drawTreeforComponent(arr, i + 1, j, visited); // south neighbour
  }

}