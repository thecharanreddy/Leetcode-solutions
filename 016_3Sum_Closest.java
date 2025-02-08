//Time Complexity : O(n²)
//Space Complexity : O(1)
// Approach : Taking one element at a time and checking for other two elements by checking minimum difference possible.
import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // Sorting is necessary
        int closestSum = 0, minDiff = Integer.MAX_VALUE;
        
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1, r = nums.length - 1;
            
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                int diff = Math.abs(target - sum);
                
                // Update closest sum if a smaller difference is found
                if (diff < minDiff) {
                    minDiff = diff;
                    closestSum = sum;
                }
                
                // Move pointers
                if (sum < target) {
                    l++;
                } else if (sum > target) {
                    r--;
                } else {
                    return sum; // Exact match found
                }
            }
        }
        return closestSum;
    }
}
