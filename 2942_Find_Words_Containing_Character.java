//Brute Force
//Time Complexity : O(n * m) [where n = number of words in the words array, m = average (or maximum) length of the words]

//Space Complexity : O(n)
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> li = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            String s =  words[i];
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == x){
                    li.add(i);
                    break;
                }
            }
        }
        return li;
    }
}
