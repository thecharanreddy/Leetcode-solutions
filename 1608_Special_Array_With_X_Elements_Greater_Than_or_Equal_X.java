// 1608. Special Array With X Elements Greater Than or Equal X
// https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/description/
// Approach : Sorting and Binary Search
// Time Complexity : O(n logn) 
// Space Complexity : O(1)

import java.util.Arrays;

class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int left = 0, n = nums.length, right = n;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = n - mid; // Number of elements >= nums[mid]
            
            if (nums[mid] >= count) {
                right = mid; // Try a smaller value of `mid`
            } else {
                left = mid + 1; // Increase `mid` to get a larger `count`
            }
        }

        // `x = n - left`, but check if it's valid
        int x = n - left;
        if (left < n && nums[left] >= x && (left == 0 || nums[left - 1] < x)) {
            return x;
        }
        return -1;
    }
}
