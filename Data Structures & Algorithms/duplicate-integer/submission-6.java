class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> duplicateOrNo = new HashSet<>();

        for(int num : nums){

            if(!duplicateOrNo.add(num)){
                return true;
            }
        }
        return false;
        
    }
}