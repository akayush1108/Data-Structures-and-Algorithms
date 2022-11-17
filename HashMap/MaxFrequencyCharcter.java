/*
Problem Statement: Highest Frequency Character

You are given a string str.
You need to Print the highest frequency character in str.

Input: str= babcccdbabccd
Output: c

Explanation: a-2, b-4, c-5, d-2
then c will be print.

 */
import java.util.HashMap;
import java.util.Scanner;
public class MaxFrequencyCharcter{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(map.containsKey(ch)) {
				int oldFrequency = map.get(ch);
				int newFrewuency = oldFrequency + 1;
				map.put(ch, newFrewuency);
			}
			else {
				map.put(ch, 1);
			}
		}
		
		char maxFrequencyCharacter = str.charAt(0);
		for(Character key: map.keySet()) {
			if(map.get(key)> map.get(maxFrequencyCharacter)) {
				maxFrequencyCharacter = key;
			}
		}
		
		System.out.println(maxFrequencyCharacter);
	}
}
