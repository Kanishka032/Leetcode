class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        if (valueDiff < 0) return false;

        Map<Long, Long> map = new HashMap<>();
        long w = (long) valueDiff + 1;

        for (int i = 0; i < nums.length; i++) {

            long num = nums[i];
            long bucket = getBucket(num, w);

            if (map.containsKey(bucket)) return true;

            if (map.containsKey(bucket - 1) &&
                Math.abs(num - map.get(bucket - 1)) < w)
                return true;

            if (map.containsKey(bucket + 1) &&
                Math.abs(num - map.get(bucket + 1)) < w)
                return true;

            map.put(bucket, num);

            if (i >= indexDiff) {
                long oldBucket = getBucket(nums[i - indexDiff], w);
                map.remove(oldBucket);
            }
        }

        return false;
    }

    private long getBucket(long num, long w) {
        if (num < 0) {
            return ((num + 1) / w) - 1;
        }
        return num / w;
    }
}