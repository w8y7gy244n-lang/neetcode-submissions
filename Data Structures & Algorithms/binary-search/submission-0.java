class Solution {
    public int search(int[] nums, int target) {

        int leftPointer = 0;
        int rightPointer = nums.length-1;
        int middle;

        while(leftPointer <= rightPointer){
             middle = (leftPointer + rightPointer) / 2;

            if(nums[middle] < target){
                leftPointer = middle + 1;

            }else if (nums[middle] > target){
                rightPointer = middle - 1;

            }else
            return middle;


            
        }
        return -1;
        
    }
}
