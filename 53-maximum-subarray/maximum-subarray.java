class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=nums[0];
        int c=nums[0];
for(int i=1;i<nums.length;i++)
{
c=Math.max(nums[i],c+nums[i]);
maxsum=Math.max(c,maxsum);
}
       

        return maxsum;
    }
}