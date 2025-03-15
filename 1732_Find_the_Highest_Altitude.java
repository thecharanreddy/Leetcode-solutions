// 1732. Find the Highest Altitude
// https://leetcode.com/problems/find-the-highest-altitude/description/?envType=study-plan-v2&envId=leetcode-75

// Approach : Brute Force
// Time Complexity : O(n)
// Space Copmplexity : O(n)

class Solution {
    public int largestAltitude(int[] gain) {
        int[] h = new int[gain.length + 1];
        h[0] = 0;
        for(int i = 0 ; i < gain.length; i++){
            h[i + 1] = h[i] + gain[i];
        }
        int res = 0;
        for(int i = 0; i < h.length ; i++){
            if(h[i] > res)
                res = h[i];
        }
        return res;
    }
}

// We can reduce time complexity to O(1)
// Time Complexity : O(1)

class Solution {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0, currentAltitude = 0;
        for (int g : gain) {
            currentAltitude += g;
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }
        return maxAltitude;
    }
}



