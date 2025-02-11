//Time complexity : O(n) (Iterates over the string once, worst case)
//Space Complexity : O(1) (Uses only integer variables)
class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int i = s.length() - 1;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count characters of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;
    }
}
