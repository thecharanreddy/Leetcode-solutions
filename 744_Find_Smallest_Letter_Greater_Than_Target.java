// Time Complexity : O(log n)
// Space Complexity : O(1)

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length-1;
        if(letters[right]<=target) return letters[0];
        while(left < right){
            int mid = left + (right-left)/2;
            if(target >= letters[mid]){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return letters[left];
    }
}
