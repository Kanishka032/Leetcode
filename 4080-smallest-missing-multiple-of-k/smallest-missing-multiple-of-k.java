class Solution {
    public int missingMultiple(int[] nums, int k) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
            // System.out.println(set.get(num));
        }
        int multiple = k;

        while (true) {
            if (!set.contains(multiple)) {
                return multiple;
            }
            multiple += k;
        }

        // return 0;
    }
}