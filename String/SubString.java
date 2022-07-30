/*
Problem Statement :
Given a string str, you need to find all substring of this string.

Input Format :
A string str

Output Format :
print all substring of str and each substring in a line as shown in sample output.

Samle Input:
abcd

Sample Output:
a
ab
abc
abcd
b
bc
bcd
c
cd
d

 */

//Driver Code :
import java.util.*;
public class SubString {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        String s = scn.nextLine(); 

        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }
        
    }
}
