class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int digitsum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 9) {
                while (nums[i] > 0) {
                    int digit = nums[i] % 10;
                    nums[i] = nums[i] / 10;
                    digitsum += digit;
                }

            } else {
                digitsum += nums[i];
            }
        }

        return Math.abs(sum - digitsum);
    }
}