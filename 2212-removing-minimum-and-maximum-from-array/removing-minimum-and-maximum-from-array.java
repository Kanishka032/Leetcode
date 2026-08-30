class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        for (int x : nums) {
            minVal = Math.min(minVal, x);
            maxVal = Math.max(maxVal, x);
        }

        int minPos = -1, maxPos = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] == minVal) minPos = i;
            if (nums[i] == maxVal) maxPos = i;
        }

        int l = Math.min(minPos, maxPos);
        int r = Math.max(minPos, maxPos);

        int case1 = r + 1;
        int case2 = n - l;
        int case3 = (l + 1) + (n - r);

        return Math.min(case1, Math.min(case2, case3));
    }
}