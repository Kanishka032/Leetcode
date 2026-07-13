// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         // int count=0;
//         for(int i=0;i<nums.length-1;i++)
//         {
//             for(int j=i+1;j<nums.length;j++)
//             {
//                 if(nums[i]==nums[j])
//             {
//                 // count ++;
//                 return true;
//             }
//             }
          
//         }
//         return false;
//     }
// }

class Solution

{
  

public  boolean containsDuplicate(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for(int num : nums) {
        if(set.contains(num)) {
            return true;
        }
        set.add(num);
    }
    return false;
}
}