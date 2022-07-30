/*
Problem Statement:
1. You are given a string. 
2. You have to print all palindromic substrings of the given string.

Input Format:
A String

Output Format:
All palindromic substrings(one in a line).
First, all palindromic substrings starting from first character of string will be printed, then from second character and so on.

Sample Input:
madam

Sample Output:
m
madam
a
ada
d
a
m

 */


import java.util.*;
public class String_Palindrome {

	//Driver Code :
	public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

    public static void solution(String s){
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                String ss = s.substring(i,j);
                if(isPalindrome(ss)==true){
                    System.out.println(ss);
                }
            }
        }
    }

    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length() - 1;
        while(i<=j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);

            if(ch1 == ch2){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
