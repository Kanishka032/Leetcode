class Solution {
    public int rob(int[] nums) {
       
        if (nums == null || nums.length == 0) {
            return 0;
        }
     
        if (nums.length == 1) {
            return nums[0];
        }

        // Track max profit from two steps back and one step back
        int prev2 = 0;
        int prev1 = 0;

        for (int num : nums) {
            // Formula: max(skip current house, rob current house)
            int current = Math.max(prev1, prev2 + num);
            
            // Shift your tracking variables forward
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}
