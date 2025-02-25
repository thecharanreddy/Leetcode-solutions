import java.util.Arrays;

class Solution {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int MOD = 1_000_000_007;
        int n = nums1.length;
        long totalDiff = 0;
        int maxImprove = 0;
        
        // Create a sorted copy of nums1 for binary search
        int[] sortedNums1 = nums1.clone();
        Arrays.sort(sortedNums1);
        
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            totalDiff = (totalDiff + diff) % MOD;
            
            // Find the closest value to nums2[i] in sortedNums1 using binary search
            int closestDiff = binarySearchClosest(sortedNums1, nums2[i]);
            // Improvement possible at index i: original diff minus new possible diff
            int improve = diff - closestDiff;
            if (improve > maxImprove) {
                maxImprove = improve;
            }
        }
        
        // Compute the final answer, ensuring it's non-negative by adjusting with MOD
        long result = (totalDiff - maxImprove) % MOD;
        if(result < 0){
            result += MOD;
        }
        return (int) result;
    }
    
    // Helper method: binary search to find the minimum absolute difference between k and any element in sorted array.
    private int binarySearchClosest(int[] sorted, int k) {
        int left = 0, right = sorted.length - 1;
        // Standard binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (sorted[mid] == k) {
                return 0; // exact match found
            } else if (sorted[mid] < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        // left is the index of the first element greater than k,
        // right is the index of the last element less than k.
        int diff1 = left < sorted.length ? Math.abs(sorted[left] - k) : Integer.MAX_VALUE;
        int diff2 = right >= 0 ? Math.abs(sorted[right] - k) : Integer.MAX_VALUE;
        return Math.min(diff1, diff2);
    }
}
