//Time Complexity : O(n)
//Space Complexity : O(1)
//https://leetcode.com/problems/valid-anagram/submissions/1543436540/

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

        int[] f = new int[26];
        for(int i = 0; i < s.length(); i++) {
            f[s.charAt(i) - 'a']++;
            f[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < f.length; i++)
            if(f[i] > 0)
                return false;

        
        return true;
    }
}
