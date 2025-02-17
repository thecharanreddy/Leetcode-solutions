

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for(String s : strs){
            char[] word = s.toCharArray();
            Arrays.sort(word);
            String s2 = String.valueOf(word);
            hm.computeIfAbsent(s2,k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}
