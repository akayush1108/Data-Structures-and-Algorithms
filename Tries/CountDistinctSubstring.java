/*
Problem Statement: Given a string of alphabetic characters. Return the count of distinct substrings of the string(including the empty string) using the Trie data structure.

Example 1:
Input: S1= “ababa”
Output: Total number of distinct substrings : 10
Explanation: All the substrings of the string are a, ab, aba, abab, ababa, b, ba, bab, baba, a, ab, aba, b, ba, a. Many of the substrings are duplicated. The distinct substrings are a, ab, aba, abab, ababa, b, ba, bab, baba. Total Count of the distinct substrings is 9 + 1(for empty string) = 10.

Example 2:
Input: S1= “ccfdf”
Output: Total number of distinct substrings : 14
Explanation:
All the substrings of the string are c, cc, ccf, ccfd, ccfdf, c, cf, cfd, cfdf, f, fd, fdf, d, df, f. Many of the substrings are duplicated. The distinct substrings are c, cc, ccf, ccfd, ccfdf, cf, cfd, cfdf, f, fd, fdf, d, df. Total Count of the distinct substrings is 13 + 1(for empty string) = 14.

*/

import java.util.*;

public class Solution {
  public static void main(String[] args) {

    String s1 = "ababa";
    System.out.println("Total number of distinct substrings : " + 
    countDistinctSubstrings(s1));

    String s2 = "ccfdf";
    System.out.println("Total number of distinct substrings : " + 
    countDistinctSubstrings(s2));

  }

  public static int countDistinctSubstrings(String s) {
    Node root = new Node();
    int n = s.length();
    int count = 0;

    for (int i = 0; i < n; i++) {
      Node node = root;

      for (int j = i; j < n; j++) {
        if (!node.containsKey(s.charAt(j))) {
          node.put(s.charAt(j), new Node());
          count++;
        }
        node = node.get(s.charAt(j));
      }
    }
    return count + 1;
  }
}

class Node {
  Node links[] = new Node[26];

  boolean containsKey(char ch) {
    return (links[ch - 'a'] != null);
  }

  Node get(char ch) {
    return links[ch - 'a'];
  }

  void put(char ch, Node node) {
    links[ch - 'a'] = node;
  }
};