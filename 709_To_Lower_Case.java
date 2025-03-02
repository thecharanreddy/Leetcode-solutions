// 709. To Lower Case
// https://leetcode.com/problems/to-lower-case/description/

// Time Complexity : O(n)
// Space Complexity : O(n

class Solution {
    public String toLowerCase(String s) {
      
      //using toLowerCase() method.
        //return s.toLowerCase();

      // Using ASCII Values
        StringBuilder sb = new StringBuilder(); 
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c >= 65 && c <= 90){
                sb.append((char)(c + 32));
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
