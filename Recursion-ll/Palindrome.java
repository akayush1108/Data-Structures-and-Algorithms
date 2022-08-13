/*
Problem Statement :
Check whether a given String S is a palindrome using recursion. Return true or false.

Input Format :
String S

Output Format :
'true' or 'false'
*/

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();
        
        if(isPalindrome(str)) {
        	System.out.println("true");
        }
        else {
        	System.out.println("false");
        }

    }
    
    public static boolean isPalindrome(String str) {
    	
    	if(str.length()<=1) {
    		return true;
    	}
    	
    	boolean subAns= isPalindrome(str.substring(1, str.length()-1));
    	boolean ans = true;
    	
    	if(str.charAt(0)!=str.charAt(str.length()-1)) {
    		return false;
    	}
    	
    	if(subAns==true && ans==true) {
    		return true;
    	}
    	return false;

    }
}



//public static boolean isPalindrome(String str) {
//	
//	if(str.length()<=1) {
//		return true;
//	}
//	if(str.charAt(0)==str.charAt(str.length() - 1)){
//        return isPalindrome(str.substring(1, str.length()-1));
//    }
//    return false;
//
//}