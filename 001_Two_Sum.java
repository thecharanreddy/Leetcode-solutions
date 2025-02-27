//Brute force approach using two for-loops for checking all the possible ways of finding sum
//Time-Complexity : O(n^2), where n is the size of the array

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j]== target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}

//Optimised method using Hashmap 
//Time-Complexity : O(n), where n is the size of the array

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int comp = target - nums[i];
            if(hm.containsKey(comp))    
                return new int[]{hm.get(comp),i};
            hm.put(nums[i],i);
        }
        return new int[]{};
    }
}
