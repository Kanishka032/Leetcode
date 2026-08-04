class Solution {
    public int findPeakElement(int[] nums) {
        int[] a=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            a[i]=nums[i];
        }
        Arrays.sort(nums);
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==nums[nums.length-1])
            {
                return i;
            }
        }
return -1;
    }
}