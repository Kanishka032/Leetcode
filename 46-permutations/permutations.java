class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums) {
        // Base case: if temp has all elements
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp)); // add a copy
            return;
        }

        for (int num : nums) {
            // Skip if already used
            if (temp.contains(num)) continue;

            // Choose
            temp.add(num);

            // Explore
            backtrack(result, temp, nums);

            // Undo (backtrack)
            temp.remove(temp.size() - 1);
        }
    }
}