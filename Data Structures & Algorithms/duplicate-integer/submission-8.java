class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet <Integer> hasDSet = new HashSet<>();

        for(int num : nums){

            if(!hasDSet.contains(num)){

                hasDSet.add(num);

            }else{
                return true;
            }

        }
        return false;
    }
}