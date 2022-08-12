/*
Problem Statement :
Check whether a given String S is a palindrome using recursion. Return true or false.

Input Format :
String S

Output Format :
'true' or 'false'

Sample Input1:
madam
Sample Output1:
true

Sample Input2:
ajksfb
Sample Output2:
false

*/

//Driver code:
import java.util.*;
public class PalindromeString {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		System.out.println(isStringPalindrome(str));
	}
	
	public static boolean isStringPalindrome(String str) {
		if(str.length()<=1) {
			return true;
		}
		
		boolean subStr = isStringPalindrome(str.substring(1,str.length()-1));
		
		if(subStr==true) {
			if(str.charAt(0)==str.charAt(str.length()-1)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
}
