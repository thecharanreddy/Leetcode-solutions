// 875. Koko Eating Bananas
// https://leetcode.com/problems/koko-eating-bananas/description/

// Intuition :
// k should lie between 1 and max(arr). Because the minimum value of k can be '1' in best case and 
// the maximum value can be 'max element in the array' i.e. 'largest pile of bananas'.
// Hence, we can perform Binary Search between (1,max) taking left = 0 and right = max,
// checking timeTaken for each value of 'mid' 
// if timeTaken is > h (Time is exceeding h for k = mid): left = mid + 1
// else (Time is within given range of h and check for least possible value): right =  mid.
// Return right/left ,when (left == right).

// Time Complexity : O(n log max(piles)) 
// 'n = for finding maximum element in array' and 'Binary search on 1, max(piles)'
// Space Complexity : O(1)

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 0;
      // Finding biggest pile in piles
        for(int pile : piles){
            if(right < pile){
                right = pile;
            }
        }
      // Binary Search
        while(left < right){
            int mid = left + (right-left) / 2;
            int timeTaken = 0;
            for(int pile : piles){
                timeTaken += (pile + (mid - 1)) / mid;
            }   
            if(timeTaken > h){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return left;
    }
}
