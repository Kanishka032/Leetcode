class Solution {
    public int search(int[] nums, int target) {
        // Arrays.sort(nums);
        int high = nums.length - 1;
        int low = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            }
           else if (nums[mid] < target) {
                low = mid+1;
            }
        else {
                high = mid-1;
            }
            
            
            // high--;
            // low++;

        }

        return -1;
    }
}