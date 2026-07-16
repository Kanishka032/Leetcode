import java.util.Arrays;

class Solution {
    public long gcdSum(int[] nums) {
        long result = 0;
        int max = 0;

        int[] gcd = new int[nums.length];
        int k = 0;

        // prefixGcd
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            gcd[k++] = gcd(nums[i], max);
        }

        // ✅ FAST SORT
        Arrays.sort(gcd);

        int left = 0;
        int right = gcd.length - 1;

        while (left < right) {
            result += gcd(gcd[left], gcd[right]);
            left++;
            right--;
        }

        return result;
    }

    // Euclidean GCD
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}