/*
Problem Statement :
Given a square matrix mat, return the sum of the matrix diagonals.
Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.


Example 1:
Input: mat = 3
			 3
			 [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.

Example 2:
Input: mat = 4
			 4
			 [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
Output: 8

 */
// Driver Code:
import java.util.Scanner;
public class MatrixDiagonalSum {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		
		int[][] matrix = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++){
				matrix[i][j] = scn.nextInt();
			}
		}
		System.out.println(diagonalSum(matrix));
	}
	
	public static int diagonalSum(int[][] matrix) {
        int sum = 0;
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                if(i == j)
                    sum +=matrix[i][j];
                
                else if(i + j == matrix.length - 1)
                    sum += matrix[i][j];
            }
        }
        
        return sum;
    }
}
