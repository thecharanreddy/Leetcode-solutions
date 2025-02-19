//Time Complexity : O(log n)
// Space complexity : O(1)

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] res = {-1, -1};
         
        res[0] = searchElement(nums,target,true);
        res[1] = searchElement(nums,target,false);
        return res;
    }
    int searchElement(int[] nums, int target , boolean isStart){
        int ans = -1;
        int left = 0 , right = nums.length - 1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(target < nums[mid]) right = mid-1;
            else if(target > nums[mid]) left = mid + 1;
            else{
                ans = mid;
                if(isStart){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
        }
        return ans;
    }
}
