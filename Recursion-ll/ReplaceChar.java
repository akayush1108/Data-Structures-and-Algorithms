/*
Problem Statement:
1. You are given a string str.
2. You are given a character original.
3. You are given a character replacement.
4. Replace the original character to replacement character in string str.


Sample Input
abxdxpx
x
y


Sample Output
abydypy


 */

//Driver Code :
import java.util.*;
public class ReplaceChar {
	
	public static void main(String[] arg) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		char ori = scn.next().charAt(0);
		char repl = scn.next().charAt(0);
		System.out.println(replaceChar(str,ori,repl));
	}
	
	public static String replaceChar(String str,char original, char replacement) {
		if(str.length()==0) {
			return str;
		}
		
		String subStr = replaceChar(str.substring(1),original,replacement);
		
		if(str.charAt(0)==original) {
			return replacement + subStr;
		}
		else {
			return str.charAt(0) + subStr;
		}
		
	}
}
