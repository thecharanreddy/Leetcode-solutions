// Using Cyclic Sort 
// Time complexity : O(n)
// Space Complexity : O(1)

class Solution {
    public int findDuplicate(int[] nums) {
      // Cyclic sort to sort nums.
        int i = 0, len = nums.length;
        while(i < len){
            int actPos = nums[i] - 1;
            if(nums[i] != nums[actPos]){
                int temp = nums[i];
                nums[i] = nums[actPos];
                nums[actPos] = temp;
            } else{
                i++;
            }
        }
      // Binary search for searching duplicate number.
      // Linear Search can also be used for searching duplicate number.
        int left = 0 , right = len - 1;
        while(left != right){
            int mid = left + (right-left) / 2;
            if(nums[mid] == mid+1) left = mid + 1;
            else right = mid;
        }
        return nums[left];
    }
}
