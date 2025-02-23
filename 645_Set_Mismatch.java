// https://leetcode.com/problems/set-mismatch/description/
// Solution: Using Cyclic Sort
// Time Complexiy : O(n)
// space Complexity : O(1)

class Solution {
    public int[] findErrorNums(int[] nums) {
        //Sorting array in place by cyclic sort.
        int i = 0, n = nums.length;
        while(i < n){
            int actPos = nums[i] - 1;
            if(nums[i] != nums[actPos]){
                int temp = nums[i];
                nums[i] = nums[actPos];
                nums[actPos] = temp;
            }
            else
                i++;
        }
      // Adding duplicate and missing number to array
        int[] arr = new int[2];
        for(i = 0; i < n;i++){
            if(nums[i] != i+1){
                arr[0] = nums[i];
                arr[1] = i+1;
                break;
            }  
        }
      //returning the list
        return arr;
    }
}
