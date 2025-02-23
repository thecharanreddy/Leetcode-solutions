// https://leetcode.com/problems/first-missing-positive/
// Solution : Using Cyclic Sort 
// Time Complexity : O(n)
// Space Complexity : O(1)

class Solution {
    public int firstMissingPositive(int[] nums) {
        // place all numbers from 1 to n at their (i-1) indices
        // Example : 1 placed at index 0, 2 at 1, 3 at 2....and n at n-1 index
        // skip if nums[i] is less than 0 OR greater than n
        // because the missing number should be from 1 to n
        int i = 0;
        while(i < nums.length){
            int actPos = nums[i]-1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[actPos]){
                int temp = nums[i];
                nums[i] = nums[actPos];
                nums[actPos] = temp;
            }
            else i++;
        }
        // checking at each index 'i' for presence of i+1
        // return 'i+1' if condition is false 
        for(i = 0; i < nums.length; i++){
            if(nums[i] != i+1){
                return i+1;
            }
        }
        // if loop is completed that means all numbers are present from 1 to n 
        // In this case the next least missing number is 'n+1'
            return nums.length+1;
    }
}
