class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> containsDuplicate = new HashMap<>();

        for(int num : nums)
        {
            if(containsDuplicate.containsKey(num))
            return true;
            else{
                containsDuplicate.put(num,num);
            }
        }
        return false;
    }
}