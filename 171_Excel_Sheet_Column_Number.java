// 171. Excel Sheet Column Number
// https://leetcode.com/problems/excel-sheet-column-number/description/
// Method : String, charAt, ASCII
// Time Complexity : 
// Space Complexity : 

class Solution {
    public int titleToNumber(String columnTitle) {
        int factor = 1, sum = 0, n = columnTitle.length() - 1;
        sum = columnTitle.charAt(n) - 'A' + 1;
        for(int i = n-1; i >= 0; i--){
            factor *= 26;
            sum += (factor * (columnTitle.charAt(i) - 'A' + 1));
        }
        return sum;
    }
}
