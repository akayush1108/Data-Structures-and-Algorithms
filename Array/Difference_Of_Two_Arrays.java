/*
Problem Statement:
1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. The two arrays represent digits of two numbers.
6. You are required to find the difference of two numbers represented by two arrays and print the arrays. a2 - a1

Assumption - number represented by a2 is greater.

Input Format:
A number n1
n1 number of elements line separated
A number n2
n2 number of elements line separated

Output Format;
A number representing difference of two numbers (a2 - a1), represented by two arrays.

Sample Input:
4
3
3
3
3
3
9
9
9

Sample Output:
2
3
3
4


 */
import java.util.*;
public class Difference_Of_Two_Arrays {

	public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        
        int n1= scn.nextInt();
        int[] a1= new int[n1];
        for(int i=0; i<a1.length; i++)
        {
            a1[i] = scn.nextInt();
        }

        int n2= scn.nextInt();
        int[] a2= new int[n2];
        for(int i=0; i<a2.length; i++)
        {
            a2[i] = scn.nextInt();
        }

        int[] diff= new int[n1>n2? n1: n2];
        int c=0;

        int i= a1.length - 1;
        int j= a2.length - 1;
        int k= diff.length - 1;
        
        while(k>=0)
        {
            int d= 0;
            int a2v = j>=0?a2[j]:0;
            
            if(a1[i]+c >= a2v) {
            	d = a1[i] + c - a2v;
            	c = 0;
            }
            else {
            	d = a1[i] + c + 10 - a2v;
            	c=-1;
            }

            diff[k]=d;
            i--;
            j--;
            k--;
        }
        
        int idx = 0;
        while(idx < diff.length) {
        	if(diff[idx]==0) {
        		idx++;
        	}
        	else {
        		break;
        	}
        }
        while(idx < diff.length) {
        	System.out.println(diff[idx]);
        	idx++;
        }
        
    }
        
}
