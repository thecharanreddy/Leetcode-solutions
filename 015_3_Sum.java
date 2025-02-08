//Time Complexity : O(n^2)
//Space Complexity : O(n)
// Approach : Keeping one element as fixed and checking other two possible values that results sum == 0.

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3) new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>> hs = new HashSet<>();
        for(int i =0; i<nums.length-2;i++){
            int left = i+1;
            int right = nums.length-1;

            while(left<right){
                if(nums[i]+nums[left]+nums[right] == 0){
                    hs.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }
                else if(nums[i]+nums[left]+nums[right] < 0){
                    left++;
                }
                else
                    right--;
            }
        }
        return new ArrayList<>(hs);
    }
}
