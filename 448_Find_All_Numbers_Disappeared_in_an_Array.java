// Using Cyclic Sort
// Time Complexity : O(n)
// Space Complexity : O(1)
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
      //Sorting array in place by cyclic sort.
        int i = 0, n = nums.length;
        while(i < n){
            int actPos = nums[i] - 1;
            if(nums[i] != nums[actPos]){
                int temp = nums[i];
                nums[i] = nums[actPos];
                nums[actPos] = temp;
            }
            else
                i++;
        }
      //Adding missing elements to the list
        List<Integer> li = new ArrayList<>();
        for(i = 0; i < n;i++){
            if(nums[i] != i+1)
                li.add(i+1); 
        }
      //returning the list
        return li;
    }
}
