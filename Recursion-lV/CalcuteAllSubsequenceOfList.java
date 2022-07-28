/*
Problem statement :
Given a string.
Calculate all subsequences of this string.
 
Input Format :
A string str.
 
Output Format :
Contents of the arraylist containing subsequences as shown in sample output.

Sample Input :
abc

Sample Output :
[, c, b, bc, a, ac, ab, abc]
 
 
 */
import java.util.*;
public class CalcuteAllSubsequenceOfList {

	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		ArrayList<String> res = gss(str);
		System.out.println(res);
	}
	
	public static ArrayList<String> gss(String str){
		if(str.length()==0) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}
		
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rres = gss(ros);
		
		ArrayList<String> mres = new ArrayList<>();
		for(String rstr: rres) {
			mres.add("" + rstr);
		}
		for(String rstr: rres) {
			mres.add(ch + rstr);
		}
		
		return mres;
	}
}
