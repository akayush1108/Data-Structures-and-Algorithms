/*
Problem Statement:
1. You are given a string str.
2. The task is to write a recursive function to replace all occurrences of pi with 3.14 in the given string and print the modified string.


Sample Input 1:
abcpid
Sample Output 1:
abc3.14d

Sample Input 2:
“pippppiiiipi” 
Sample Output 2: 
3.14ppp3.14iii3.14

*/

//Driver Code :
import java.util.*;
public class ReplacePi {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		System.out.println(replacepi(str));
	}
	
	public static String replacepi(String str) {
		if(str.length()<=1) {
			return str;
		}
		
		if(str.substring(0,2).equals("pi")) {
			String subStr = replacepi(str.substring(2));
			return "3.14" + subStr;
		}
		else {
			String subStr = replacepi(str.substring(1));
			return str.charAt(0) + subStr;
		}
	}
}
