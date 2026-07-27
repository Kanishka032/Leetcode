class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> a = new ArrayList<>();
        // int min;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - 1; i++) {
            min = Math.min(min, nums[i + 1] - nums[i]);
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] == min) {
                List<Integer> b = new ArrayList<>();
                b.add(nums[i]);
                b.add(nums[i + 1]);
                a.add(b);
            }
        }

        return a;

    }
}