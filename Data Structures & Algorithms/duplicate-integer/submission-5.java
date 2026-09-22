class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet <Integer> containsDuplicate = new HashSet<>();

        for(int num : nums)
        {
            if(containsDuplicate.add(num) == false)
            return true;
        }
        return false;
    }
}