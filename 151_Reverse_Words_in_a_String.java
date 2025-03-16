// 151. Reverse Words in a String
// https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=leetcode-75
// Time Complexity : O(N)
// Space Complexity : O(N) [Because String Builder is used]

class Solution {
    public String reverseWords(String s) {
        // Trim leading and trailing spaces and split by whitespace
        String[] words = s.trim().split("\\s+");  
        StringBuilder res = new StringBuilder();

        // Iterate in reverse order to construct the result
        for (int i = words.length - 1; i >= 0; i--) {
            res.append(words[i]);
            if (i > 0) res.append(" ");  // Add space between words
        }

        return res.toString();
    }
