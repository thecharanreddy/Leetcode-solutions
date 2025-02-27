// 1051. Height Checker
// https://leetcode.com/problems/height-checker/
// Time Complexity : O(n logn)
// Space Complexity : O(n)
class Solution {
    public int heightChecker(int[] heights) {
        int[] arr = new int[heights.length];
        for(int i = 0; i < arr.length; i++){
            arr[i] = heights[i];
        }
        Arrays.sort(arr);
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != heights[i])
                count++;
        }
        return count;
    }
}

