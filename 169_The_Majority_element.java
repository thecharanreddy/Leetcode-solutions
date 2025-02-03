// Using HashMap
// Time complexity: O(n)
// Space Complexity : O(n)

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        int n = nums.length;
        int maj = nums[0];
        for(int num : nums){
            if(hash.containsKey(num)){
                hash.put(num,hash.get(num)+1);
            }
            else
                hash.put(num,1);
            
            if(hash.get(num)>(n/2))   
                maj = num;
        }
        return maj;
    }
}
// Expected solution
// Using Boyer Moore's Voting Algorithm
// Time Complexity : O(n)
// Space Complexity : O(1)

class Solution {
    public int majorityElement(int[] nums) {
        int maj = -1;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                maj = nums[i];
                count++;
                continue;
            }
            
            if(maj == nums[i])
                count++;
            else
                count--;
        }
        return maj;
    }
}

