class Solution {
    public int[] numberGame(int[] nums) {
        int n = nums.length;
        int[] a = new int[n];
        Arrays.sort(nums);
        // int First = nums[0];
        // int second = nums[1];

       for (int i = 0; i < n; i += 2) {
            a[i] = nums[i + 1];
            a[i + 1] = nums[i];
        }

        return a;
    }
}