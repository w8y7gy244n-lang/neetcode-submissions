class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int difference;
        HashMap<Integer,Integer> tsHmap = new HashMap<>();
        
        for(int i = 0; i< nums.length ; i ++) {

            difference = target - nums[i];

            if(!tsHmap.containsKey(difference)){
                tsHmap.put(nums[i], i);

            }else{
                return new int[]{tsHmap.get(difference), i};
            }
        }
        return new int[0];
    }
}
