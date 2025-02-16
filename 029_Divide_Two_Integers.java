// Time Complexity : O((logn)^2) 
// Because in worst-case, dividend is roughly halved in each iteration of outer loop 
// ..and divisor is doubled in each iteration of inner loop
// Space Complexity : O(1)
class Solution {
    public int divide(int dividend, int divisor) {
        // Handling over-flow case
        if(dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        
        boolean sign = (divisor >= 0) == (dividend >= 0);
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int result = 0;
        while(dividend - divisor >= 0){
            int count = 0;
            while((dividend - (divisor << 1 << count)) >= 0){
                count++;
            }
            result += 1<<count;
            dividend -= divisor << count;
        }
        return sign ? result : -result;
    }
}
