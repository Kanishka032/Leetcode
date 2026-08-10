class Solution {
    public int maximumGap(int[] nums) {
        if (nums.length - 1 == 0) {
            return 0;
        }
        int diff = Integer.MIN_VALUE;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i + 1] - nums[i]) > diff) {
                diff = nums[i + 1] - nums[i];
            }
        }
        return diff;
    }
}