class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> sumTwo = new HashMap<>();
        int difference;
        for(int i = 0; i < nums.length; i++)
        {
            difference = target-nums[i];
            if(sumTwo.containsKey(difference))
            {
                return new int[] {sumTwo.get(difference),i};
            }else
            {
                sumTwo.put(nums[i],i);
            }
            
        }
        return new int[] {};
    }
}
