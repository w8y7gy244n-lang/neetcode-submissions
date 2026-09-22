class Solution {
    public int[] twoSum(int[] nums, int target) {

         HashMap <Integer, Integer> sumMap = new HashMap<>();

        for(int i = 0; i < nums.length ; i++){
            int difference = target - nums[i];

            if(sumMap.containsKey(difference)){
                return new int[] {sumMap.get(difference), i}; // Devuelve en indice del numero anterior que completa la suma y el indice actual.
             }
                sumMap.put(nums[i], i);
            }
            
            return nums;
        }
    }