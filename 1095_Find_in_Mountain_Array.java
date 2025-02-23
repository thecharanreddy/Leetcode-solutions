// Time Complexity : O(log n)
// Space Complexity : O(1)

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int left = 0 , right = mountainArr.length() - 1;
        while(left != right){
            int mid = left + (right - left ) / 2;
            if(mountainArr.get(mid) < mountainArr.get(mid + 1)){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        int peek = left;
        int res = agnosticOrderBinarySearch(target, mountainArr, 0, peek);
        if(res != -1){
            return res;
        }
        else
            return agnosticOrderBinarySearch(target, mountainArr, peek+1, mountainArr.length()-1);
    }

    int agnosticOrderBinarySearch(int target,MountainArray mountainArr , int left ,int right){
        boolean isAsc = (mountainArr.get(left) <= mountainArr.get(right));
        

        while(left <= right){
            int mid = left + (right - left)/2;
            if(mountainArr.get(mid) == target){
                return mid;
            }
            if(isAsc){
                if(mountainArr.get(mid) < target){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
            else{
                if(mountainArr.get(mid) < target){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}
