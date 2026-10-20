class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> tsHM = new HashMap<>();

        for(int i=0 ; i < nums.length ; i++){

            int difference = target - nums[i];

            if(!tsHM.containsKey(difference)){
                tsHM.put(nums[i],i);
            }else{
                return new int[] {tsHM.get(difference),i};
            }
        }
        return new int[] {};
    }
}
