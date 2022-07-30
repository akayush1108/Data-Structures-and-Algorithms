/*
Problem Statement:
Given a string str, If string length is less than 10 then return same string str, otherwise return first and last character and the remaining element length.
follow the examples.

Example 1:
Input: Civilization
Output:C10n

Example 2:
Input: word
Output: word
 */
import java.util.Scanner;
public class LongWord {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(findLong(str));
	}
	
	
	public static String findLong(String str) {
		if(str.length()<=10) {
			return str;
		}
		
		String ans="";
		int count=0;
		String s= str.substring(1,str.length()-1);
		for(int i=0;i<s.length();i++) {
			count++;
		}
		String c= Integer.toString(count);
		ans= str.charAt(0) + c + str.charAt(str.length()-1);
		return ans;
	}
}
