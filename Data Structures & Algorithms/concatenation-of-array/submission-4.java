class Solution {
    public int[] getConcatenation(int[] nums) {

        int capacity = 2 * nums.length;
        int[] ans = new int[capacity];

        for(int i = 0; i < capacity ; i++){
            ans[i] = nums[i%nums.length]; //Nums.length will always be 3 that is why it will reset i                                         //to 0
        }
        return ans;
    }
    
}