// Time Complexity : O(n)
// Space Complexity : O(1)
// Method using sum of elements 
class Solution {
    public int missingNumber(int[] nums) {
        int actualSum = 0;
        int sum = 0;
        for(int i = 0; i <= nums.length; i++){
            actualSum += i;
            if(i < nums.length)
                sum += nums[i];
        }
        return actualSum - sum;
    }
}

//Using CyclicSort 

class Solution {
    public int missingNumber(int[] nums) {
        int i = 0, len = nums.length;
        while(i < len){
            int actPos = nums[i];
            if(actPos < len && nums[i] != nums[actPos]){
                int temp = nums[i];
                nums[i] = nums[actPos];
                nums[actPos] = temp;
            } else{
                i++;
            }
        }

        for(i = 0; i < len; i++){
            if(nums[i] != i) return i;
        }
        return i;
    }
}
