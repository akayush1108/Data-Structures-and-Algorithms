/*
Problem Statement:
1. You are given a string exp representing an expression.
2. Assume that the expression is balanced  i.e. the opening and closing brackets match with each other.
3. But, some of the pair of brackets maybe extra/needless. 
4. You are required to print true if you detect extra brackets and false otherwise.

e.g.'
((a + b) + (c + d)) -> false
(a + b) + ((c + d)) -> true

Sample Input:
(a + b) + ((c + d))

Sample Output:
true

 */
import java.util.Scanner;
import java.util.Stack;
public class DuplicateBrackets {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
//		Stack<Character> st = new Stack<>();
//		for(int i=0;i<str.length();i++) {
//			char ch = str.charAt(i);
//			if(ch==')') {
//				if(st.peek()=='(') {
//					System.out.println(true);
//					return;
//				}
//				else {
//					while(st.peek() != '(') {
//						st.pop();
//					}
//					st.pop();  // for also removing opening bracket
//				}
//			}
//			else {
//				st.push(ch);
//			}
//		}
		System.out.println(Solution.duplicateBtracket(str));
		
	}
}
class Solution{
	public static boolean duplicateBtracket(String str) {
		
		Stack<Character> st = new Stack<>();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch==')') {
				if(st.peek()=='(') {
					return true;
				}
				else {
					while(st.peek() != '(') {
						st.pop();
					}
					st.pop();  // for also removing opening bracket
				}
			}
			else {
				st.push(ch);
			}
		}
		
		return false;
	}
}
