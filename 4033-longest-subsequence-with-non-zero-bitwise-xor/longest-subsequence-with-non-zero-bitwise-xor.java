class Solution {
    public int longestSubsequence(int[] nums) {
        int totalXor = 0;
        boolean hasNonZero = false;
        
        for (int num : nums) {
            totalXor ^= num;
            if (num != 0) {
                hasNonZero = true;
            }
        }
        
        // Case 1: Total XOR is already non-zero. Take the entire array.
        if (totalXor != 0) {
            return nums.length;
        }
        
        // Case 2: Total XOR is zero, but we have non-zero elements. 
        // Drop one non-zero element to make the remaining XOR non-zero.
        if (hasNonZero) {
            return nums.length - 1;
        }
        
        // Case 3: The array contains only zeros. No valid subsequence exists.
        return 0;
    }
}
