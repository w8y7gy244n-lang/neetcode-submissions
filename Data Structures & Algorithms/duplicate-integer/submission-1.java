class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> duplicateCheck = new HashMap<>();

        for(int num : nums){

            if(duplicateCheck.containsKey(num)){
                return true;
            }else{
                duplicateCheck.put(num, 1);
            }
        }
        return false;
    }
}