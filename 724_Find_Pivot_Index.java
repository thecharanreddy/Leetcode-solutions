// 724. Find Pivot Index
// https://leetcode.com/problems/find-pivot-index/description/?envType=study-plan-v2&envId=leetcode-75
// Approach : creating leftSum and rightSum arrays, Checking for index with same sum value in arrays.
// Time Complexity : O(n)
// Space Complexity : O(n)

class Solution {
    public int findMiddleIndex(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];

        int left = 0;
        for(int i = 0; i < nums.length; i++){
            leftSum[i] = left;
            left += nums[i];
        }

        int right = 0;
        for(int i = nums.length - 1; i >= 0; i--){
            rightSum[i] = right;
            right += nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            if(leftSum[i] == rightSum[i])
                return i;
        }
        return -1;
    }
}


// Approach : Without using extra space 
// Time Complexity : O(n)
// Space Complexity : O(1)

class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0, leftSum = 0;
        
        for (int num : nums) {
            totalSum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        
        return -1;
    }
}

