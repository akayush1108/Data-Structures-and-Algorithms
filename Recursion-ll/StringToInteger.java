/*
Problem Statement:
1. You are given a String str.
2. You have to convert it into Integer using recursion.


Sample Input:
1234

Sample Output:
1234

*/

//Driver Code :
import java.util.*;
public class StringToInteger {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(convertStringToInt(str));
	}
	
	public static int convertStringToInt(String str) {
		if(str.length()==0) {
			return 0;
		}
		
		String subStr = str.substring(0,str.length()-1);
		int subAnswer = convertStringToInt(subStr);
		int lastInt = str.charAt(str.length()-1) - '0';
		int ans = (subAnswer * 10) + lastInt;
		return ans;
	}
}
