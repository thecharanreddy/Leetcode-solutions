//Brute Force Approach (non-efficient and throws time-limit exceeded in LeetCode.
//Time Complexity : O(n^2)
//Space Complexity : O(1)

class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int len = height.length;
        for(int i = 0; i < len-1; i++){
            for(int j = i+1; j < len; j++){
                int currArea = (j - i) * Math.min(height[j],height[i]);
                if(currArea > maxArea) maxArea = currArea;
            }
        }
        return maxArea;
    }
}


//Two Pointer Approach (efficient Approach)
//Time Complexity : O(n)
//Space Complexity : O(1)

class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0, len = height.length;
        int i = 0, j = len - 1;
        while(i < j){
            int area = (j-i) * Math.min(height[i],height[j]);
            if (area > maxArea){
                maxArea = area;
            }
            if(height[i] <= height[j]) i++;
            else j--;
        }
        return maxArea;
    }
}
