/*
Problem Statement :
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
    1 -> 
    2 -> abc
    3 -> def
    4 -> ghi
    5 -> jkl
    6 -> mno
    7 -> pqrs
    8 -> tuv
    9 -> wxyz
 

Example 1:
Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

Example 2:
Input: digits = ""
Output: []

Example 3:
Input: digits = "2"
Output: ["a","b","c"]


Constraints:

    0 <= digits.length <= 4
    digits[i] is a digit in the range ['2', '9'].


 */

class Solution {
    
    static String[] codes = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) {
            List<String> ans = new ArrayList<>();
            return ans;
        }
        List<String> ans = letterCombinationsHelper(digits);
        return ans;
    }
    
    public List<String> letterCombinationsHelper(String digits) {
        if(digits.length()==0) {
			List<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}
		
		char ch = digits.charAt(0);
		String ros = digits.substring(1);
		List<String> rres = letterCombinationsHelper(ros);
		
		List<String> mres = new ArrayList<>();
		String codeforch = codes[ch - '1'];
		for(int i=0; i<codeforch.length(); i++) {
			char chcodes = codeforch.charAt(i);
			for(String rstr: rres) {
				mres.add(chcodes + rstr);
			}
		}
		
		return mres;
    }
}