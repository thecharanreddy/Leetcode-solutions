class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) { 
                digits[i]++;  // Just increment if it's not 9
                return digits;
            }
            digits[i] = 0;  // Set to 0 if it's 9
        }

        // If we reach here, it means we had all 9s (e.g., [9,9,9] → [1,0,0,0])
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}
