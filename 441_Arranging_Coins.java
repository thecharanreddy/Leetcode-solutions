// 441. Arranging Coins
// https://leetcode.com/problems/arranging-coins/description/
// Method : Using Binary Search
// Time Complexity : O(log n)
// Space Complexity : O(1)

class Solution {
    public int arrangeCoins(int n) {
        int left = 1, right = n;
        while(left <= right){
            int mid = left + (right - left) / 2;
            long coins =(long) mid * (mid + 1) / 2;
            if(coins == n){
                return mid;
            }
            else if(coins > n){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return right;
    }
}
