/*
Problem Statement :
Given a string str, you need to reverse of this string.

Input Format :
A string str

Output Format :
print reverse of str as shown in sample output.

Samle Input:
welcome

Sample Output:
emoclew

 */

//Driver Code :
import java.util.Scanner;
public class Solution{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		String ans = ("");
		
		for(int i=str.length()-1; i>=0;i--) {
			ans+= str.charAt(i);
		}
		System.out.println(ans);
		
	
     
    }
}