// Time Complexity : O(log n)
// Space Complexity : O(1)
// Method 1 : Finding pivot and applying Binary Search from o to pivot then pivot+1 to last element.
class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int pivot = 0;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(target == nums[mid]){
                return mid;
            }
            if(left == right || nums[mid] > nums[mid+1]){
                pivot = mid;
                break;
            }
            else{
                if(nums[left] < nums[mid]){
                    left = mid;
                }
                else{
                    right = mid;
                }
            }
        }
       
        int res = binarySearch(nums,target,0,pivot);
        if(res != -1){
            return res;
        }
        
        return binarySearch(nums,target,pivot+1,nums.length - 1);
        
    }
    int binarySearch(int[] nums,int target, int left, int right){
        int ans = -1;
        while(left <= right){
            int mid = left + (right-left) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return ans;
    }
}


// Time Complexity : O(log n)
// Space Complexity : O(1)
// Method 2 :  Simple and Robust. No explicit pivot finding

class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Check if mid is the target.
            if (nums[mid] == target) {
                return mid;
            }
            
            // Determine which side is sorted.
            if (nums[left] <= nums[mid]) { 
                // Left side is sorted.
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; // target is in the left sorted portion.
                } else {
                    left = mid + 1;
                }
            } else {
                // Right side is sorted.
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1; // target is in the right sorted portion.
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
