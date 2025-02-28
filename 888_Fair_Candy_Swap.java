// 888. Fair Candy Swap
// https://leetcode.com/problems/fair-candy-swap/description/

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum = 0, bobSum = 0;

        for(int candySize : aliceSizes){
            aliceSum += candySize;
        }

        HashSet<Integer> hs = new HashSet<>();
        for(int candySize : bobSizes){
            hs.add(candySize);
            bobSum += candySize;
        }

        int avg = (aliceSum + bobSum) / 2;
        for(int candySize : aliceSizes){
            if(hs.contains(avg - (aliceSum - candySize))){
                return new int[]{candySize,(avg - (aliceSum - candySize))};
            }
        }

        return new int[]{0,0};
    }
}
