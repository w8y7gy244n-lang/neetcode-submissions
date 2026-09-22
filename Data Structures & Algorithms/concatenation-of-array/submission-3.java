class Solution {
    public int[] getConcatenation(int[] nums) {

        int capacity = 2 * nums.length;
        int[] ans = new int[capacity];

        for(int i = 0; i < capacity; i++){
            // i iterates through the entire 'ans' array (0 to 2*nums.length - 1)
            // i % nums.length "wraps" the index cyclically back into nums
            // so that once i passes nums.length-1, it starts reading from nums[0] again
            ans[i] = nums[i%nums.length];
        }
        return ans;
    }
}