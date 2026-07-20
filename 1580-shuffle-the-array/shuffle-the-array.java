class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] c = new int[2 * n];

        int k = 0;
        for (int i = 0; i < n; i++) {

            c[k++] = nums[i];

            c[k++] = nums[i + n];

        }
        return c;
    }
}